package com.cassia.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeitorDeArquivo {
    public static void main(String[] args) {
        File file = new File("/Users/andersonluizpereira/cassia/teste/src/main/java/com/cassia/teste/numeros.txt");

        Scanner scan = null;

        try {
            scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineArray = line.split(",");
                // do something with lineArray, such as instantiate an object
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
