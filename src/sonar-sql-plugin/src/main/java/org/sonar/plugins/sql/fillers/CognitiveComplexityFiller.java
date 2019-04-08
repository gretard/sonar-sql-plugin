package org.sonar.plugins.sql.fillers;

import org.antlr.sql.dialects.DialectLanguageTypesMap;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.visitors.ClassTypesCountingVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.sensors.CGIssuesSensor;

public class CognitiveComplexityFiller implements Filler {

	private static final Logger LOGGER = Loggers.get(CognitiveComplexityFiller.class);

	public void fill(InputFile file, SensorContext context, AntlrContext antlrContext) {
		try {
			DialectLanguageTypesMap types = antlrContext.types;
			ParseTree root = antlrContext.getRoot();

			ClassTypesCountingVisitor visitor = new ClassTypesCountingVisitor(types.getCognitiveComplexityClasses());

			visitor.visit(root);

			synchronized (context) {
				context.<Integer>newMeasure().on(file).forMetric(CoreMetrics.COGNITIVE_COMPLEXITY)
						.withValue(visitor.getCounter() + 1).save();

			}

		} catch (Throwable e) {
			LOGGER.warn("Error adding cognitive complexity measures on " + file, e);
		}

	}

}
