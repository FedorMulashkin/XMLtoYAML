package com.fedormulashkin;

import com.fedormulashkin.documentprocessing.XMLtoYAML;

import java.io.*;
import java.util.Scanner;

/**
 * Раскомментируйте строки, чтобы задать другие названия файлов.
 * По умолчанию XML-файл = sample.xml, YAML-файл = output.yml
 */
public class App {
    public static void main(String[] args) throws IOException {
        String pathToXML = "sample.xml";
        String pathToYAML = "output.yml";
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название XML-файла");
        pathToXML = scan.nextLine();
        System.out.println("Введите название YAML-файла");
        pathToYAML = scan.nextLine();
        */
        XMLtoYAML xmLtoYAML = new XMLtoYAML(pathToXML, pathToYAML);
        xmLtoYAML.process();
    }
}
