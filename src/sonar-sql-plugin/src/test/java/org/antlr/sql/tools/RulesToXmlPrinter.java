package org.antlr.sql.tools;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.antlr.sql.dialects.SQLDialectRules;
import org.antlr.sql.dialects.rules.CommonRules;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class RulesToXmlPrinter {

    public static void main(String[] args) throws JAXBException {
        List<SqlRules> rules = SQLDialectRules.INSTANCE.getRules();
        SqlRules rule = CommonRules.INSTANCE.getRules().get(0);

        JAXBContext context = JAXBContext.newInstance(SqlRules.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(rule, new File("out.xml"));

    }

}
