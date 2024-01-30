package org.antlr.sql.tools;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.antlr.sql.dialects.rules.CommonRules;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class RulesToXmlPrinter {

    public static void main(String[] args) throws JAXBException {
        SqlRules rule = CommonRules.INSTANCE.getRules().get(0);

        writeRules(rule);
    }

    public static void writeRules(SqlRules rule) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(SqlRules.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(rule, new File("out.xml"));
    }
}
