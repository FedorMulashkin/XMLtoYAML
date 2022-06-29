package com.fedormulashkin.documentprocessing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.fasterxml.jackson.dataformat.yaml.YAMLParser;
import org.json.JSONObject;
import org.json.XML;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class XMLtoJSON {
    private String xmlString;
    private JsonNode jsonNode;

    private HashMap<String, JsonNode> map;
    private String jsonString;
    private File xmlFile;

    public XMLtoJSON(String path) throws IOException {
        this.xmlFile = new File(path);
        readXML();
        XmlMapper xmlMapper = new XmlMapper();
        try {
            jsonNode = xmlMapper.readTree(xmlString.getBytes());
            ObjectMapper jsonMapper = new ObjectMapper();
            Iterator<Map.Entry<String, JsonNode>> iterator = jsonNode.fields();
            JsonNode node = iterator.next().getValue();
            node.forEach(System.out::println);
            jsonString = jsonMapper.writeValueAsString(jsonNode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        deleteUnnecessaryProperty();
    }

    public XMLtoJSON() {
    }

    public JsonNode getJsonNode() {
        return jsonNode;
    }

    public void setXmlFile(String path) {
        this.xmlFile = new File(path);
    }
    private void readXML(){
        try (BufferedReader br = new BufferedReader(new FileReader(xmlFile))) {
            StringBuilder sb = new StringBuilder();
            while (br.ready()){
                sb.append(br.readLine());
                sb.append(System.lineSeparator());
            }
            xmlString = sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteUnnecessaryProperty() throws IOException {
        String jsonAsYaml = null;
        try {
            jsonAsYaml = new YAMLMapper().writeValueAsString(jsonNode);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.writeValue(new File("output.yml"), jsonString);
        //System.out.println(jsonAsYaml);
    }
}
