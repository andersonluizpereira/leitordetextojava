package com.cassia.teste;
import com.cassia.leitorDeArquivos.Leitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ReadFileLineByLineDemo {

    public static void main(String[] args) {
        leitores();
    }

    private static void leitores() {

        try {

            Stream<String> lines = new Leitor().arquivo();
            lines.forEach(e -> {
                int X = 2;
                int Y = 25;
                String[] lineArray = e.split(",");
                for (int i = 0; i < lineArray.length ; i++) {
                    if (lineArray[i].charAt(0) == '(') {

                    }
                }
            });
            lines.close();
        } catch(Exception io) {
            io.printStackTrace();
        }
    }

}
