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

class DadosTest {
    final String PATH = "xml/";

    @Test
    void constructor0() {
        Dados ds1 = new Dados();
        assertEquals(0, ds1.cuantosValores(), "Constructor sin parámetros");
    }

    @Test
    void constructor1() {
        Dados ds0 = new Dados(0);
        assertEquals(0, ds0.cuantosValores(), "Constructor con 1 parámetro n = 0");
        Dados ds1 = new Dados(1);
        assertEquals(1, ds1.cuantosValores(), "Constructor con 1 parámetro n = 1");
        Dados ds2 = new Dados(2);
        assertEquals(2, ds2.cuantosValores(), "Constructor con 1 parámetro n = 2");
        Dados ds3 = new Dados(3);
        assertEquals(3, ds3.cuantosValores(), "Constructor con 1 parámetro n = 3");
        Dados ds4 = new Dados(4);
        assertEquals(3, ds3.cuantosValores(), "Constructor con 1 parámetro n = 4");
    }

    @Test
    void constructor3() {
        Dados ds0 = new Dados(4, 2, 1);
        assertEquals(3, ds0.cuantosValores(), ds0.toString());
        Dados ds1 = new Dados(5, 2, 0);
        assertEquals(2, ds1.cuantosValores(), ds1.toString());
        Dados ds2 = new Dados(3, 0, 0);
        assertEquals(1, ds2.cuantosValores(), ds1.toString());
    }

    @Test
    void tirarDado() {
        Dados ds0 = new Dados();
        ds0.tirarDado();
        assertEquals(1, ds0.cuantosValores(), ds0.toString());
        ds0.tirarDado();
        assertEquals(2, ds0.cuantosValores(), ds0.toString());
        ds0.tirarDado();
        assertEquals(3, ds0.cuantosValores(), ds0.toString());
    }

    @Test
    void tirarDados() {
        Dados ds0 = new Dados();
        ds0.tirarDados(0);
        assertEquals(0, ds0.cuantosValores(), ds0.toString());
        ds0.tirarDados(1);
        assertEquals(1, ds0.cuantosValores(), ds0.toString());
        ds0.tirarDados(2);
        assertEquals(2, ds0.cuantosValores(), ds0.toString());
        ds0.tirarDados(3);
        assertEquals(3, ds0.cuantosValores(), ds0.toString());
    }

    @Test
    void gana() {
        Dados ds1 = new Dados(5, 2, 0);
        Dados ds2 = new Dados(3, 0, 0);
        assertEquals(1, ds1.gana(ds2), ds1.toString() + " - " + ds2.toString());
        Dados ds3 = new Dados(5, 2, 0);
        Dados ds4 = new Dados(5, 2, 0);
        assertEquals(0, ds3.gana(ds4), ds3.toString() + " - " + ds4.toString());
        Dados ds5 = new Dados(2, 0, 0);
        Dados ds6 = new Dados(1, 0, 0);
        assertEquals(1, ds5.gana(ds6), ds5.toString() + " - " + ds6.toString());
        Dados ds7 = new Dados(6, 4, 3);
        Dados ds8 = new Dados(4, 3, 0);
        assertEquals(2, ds7.gana(ds8), ds7.toString() + " - " + ds8.toString());
    }

    @Test
    void toXml() {
        String xsdFile = PATH + "dados.xsd";
        String outputXml = PATH + "dados.xml";
        Dados d1 = new Dados();
        d1.tirarDados(3);
        String xml = d1.toXml();
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