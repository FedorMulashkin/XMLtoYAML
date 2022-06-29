package com.fedormulashkin.documentprocessing;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.fedormulashkin.objectsfromdocument.RdcTr;

import java.io.*;

/**
 * Данный класс предназначен для конвертирования определенноготипа XML-документов в YAML-документы.
 * При выгрузке в YAML-файл не попадает поле Properties.TechRegs.
 * Чтобы создать объект класса, нужно при создании объекта поместить путь к XML-файлу и YAML-файлу в конструктор.
 * Класс содаржит только 1 публичный метод process(), который преобразует XML в YAML.
 */
public class XMLtoYAML {
    private RdcTr document;
    private String xmlString;
    private JsonNode jsonNode;
    private File xmlFile;
    private File yamlFile;
    public XMLtoYAML() {
    }

    public XMLtoYAML(String pathToXMLFile, String pathToYAMLFile) {
        this.xmlFile = new File(pathToXMLFile);
        this.yamlFile = new File(pathToYAMLFile);
    }

    public RdcTr getDocument() {
        return document;
    }

    public String getXmlString() {
        return xmlString;
    }

    public JsonNode getJsonNode() {
        return jsonNode;
    }

    public File getXmlFile() {
        return xmlFile;
    }

    public File getYamlFile() {
        return yamlFile;
    }

    public void process() {
        readXML();
        xmlToJson();
        createDocumentObject();
        writeYAML();
    }

    private void xmlToJson() {
        xmlString = readXML();
        XmlMapper xmlMapper = new XmlMapper();
        try {
            jsonNode = xmlMapper.readTree(xmlString.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeYAML() {
        YAMLMapper yamlMapper = new YAMLMapper();
        try {
            yamlMapper.writeValue(yamlFile, document);
            System.out.println("YAML-файл " + yamlFile.getPath() + " готов");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createDocumentObject() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        try {
            document = objectMapper.readValue(jsonNode.get("RdcTr").toString(), RdcTr.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private String readXML() {
        String tempXMLString;
        try (BufferedReader br = new BufferedReader(new FileReader(xmlFile))) {
            StringBuilder sb = new StringBuilder();
            while (br.ready()) {
                sb.append(br.readLine());
                sb.append(System.lineSeparator());
            }
            tempXMLString = sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tempXMLString;
    }
}
