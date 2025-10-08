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

class AtaqueTest {
    final String PATH = "xml/";

    @Test
    void ataca() {
        Territorio t1 = new Territorio("Buztintxuri", 1, 1);
        Territorio t2 = new Territorio("Arrosadia", 2, 1);
        Ataque a1 = new Ataque(t1, t2);
        a1.ataca();
        assertEquals(t1.getPropietario(), t2.getPropietario(), "El atacante al ganar se queda el territorio");
        assertEquals(1, t1.getEjercitos(), "El ganador deja 1 ejercito en el territorio conquistado");
        assertEquals(1, t2.getEjercitos(), "El ganador deja 1 ejercito en el territorio conquistado");
    }

    @Test
    void toXml() {
        String xsdFile = PATH + "ataque.xsd";
        String outputXml = PATH + "ataque.xml";
        Territorio t1 = new Territorio("Buztintxuri", 1, 3);
        Territorio t2 = new Territorio("Arrosadia", 2, 2);
        Ataque a1 = new Ataque(t1, t2);
        a1.ataca();
        String xml = a1.toXml();
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