package com.cassia.leitorDeArquivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Leitor {
    public Stream<String> arquivo() {

        try {
            String fileName = "/Users/andersonluizpereira/cassia/teste/src/main/java/com/cassia/teste/numerosbasica.txt";
            return Files.lines(Paths.get(fileName));
        } catch(IOException io) {
            io.printStackTrace();
        }
        return null;
    }

    public Map<String, Integer> converter(Stream<String> lines) {
        final String[] lineArray = new String[5];

        lines.forEach(e -> {
            int i = 0;
            lineArray[i] = e;
            i++;
        });
        for (int i = 0; i < lineArray.length ; i++) {

            System.out.println(lineArray[i]);
        }
        return null;
    }
}
