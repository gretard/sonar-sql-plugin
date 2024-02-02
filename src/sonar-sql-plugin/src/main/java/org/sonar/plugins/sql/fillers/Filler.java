package org.sonar.plugins.sql.fillers;

import org.antlr.sql.models.AntlrContext;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;

public interface Filler {
    public void fill(InputFile file, SensorContext context, AntlrContext antlrContext);
}
