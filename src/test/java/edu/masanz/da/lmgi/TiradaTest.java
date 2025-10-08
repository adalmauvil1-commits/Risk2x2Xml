package edu.masanz.da.lmgi;

import org.junit.jupiter.api.Test;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileWriter;

import static org.junit.jupiter.api.Assertions.*;

class TiradaTest {

    final String PATH = "xml/";

    @Test
    void toXml() {
        String xsdFile = PATH + "tirada.xsd";
        String outputXml = PATH + "tirada.xml";
        Tirada t1 = new Tirada(3,2);
        String xml = t1.toXml();
        validate(xml, outputXml, xsdFile);
    }

    void validate(String xml, String outputXml, String xsdFile) {
        try {
            FileWriter fw = new FileWriter(outputXml);
            fw.write(xml);
            fw.flush();
            SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            File schemaFile = new File(xsdFile);
            Schema schema = factory.newSchema(schemaFile);
            File xmlFile = new File(outputXml);
            Source xmlSource = new StreamSource(xmlFile);
            Validator validator = schema.newValidator();
            validator.validate(xmlSource);
        }catch (Exception e) {
            assertEquals("", "ERROR VALIDACIÓN", "Error al validar " +  outputXml);
        }
    }
}