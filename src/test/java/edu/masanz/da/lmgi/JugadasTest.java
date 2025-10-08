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

class JugadasTest {
    final String PATH = "xml/";

    @Test
    void toXml() {
        String xsdFile = PATH + "jugadas.xsd";
        String outputXml = PATH + "jugadas.xml";
        Territorio t1 = new Territorio("Buztintxuri", 1, 4);
        Territorio t2 = new Territorio("Arrosadia", 2, 3);
        Jugadas jugadas = new Jugadas();
        Ataque a1 = new Ataque(t1, t2);
        a1.ataca();
        jugadas.addAtaque(a1);
        Ataque a2 = new Ataque(t2, t1);
        a2.ataca();
        jugadas.addAtaque(a2);
        Ataque a3 = new Ataque(t1, t2);
        a3.ataca();
        jugadas.addAtaque(a3);
        String xml = jugadas.toXml();
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