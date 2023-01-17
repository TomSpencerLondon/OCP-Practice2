package com.tomspencerlondon.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFile {
    public static void main(String[] args) {
        String filename = "src/main/resources/testOut5.csv";
        String filename2 = "src/main/resources/other/testOut5.csv";

        Path source = Paths.get(filename);
        Path target = Paths.get(filename2);

        try {
            if (Files.exists(source) && Files.notExists(target)) {
                Files.move(source, target);
            } else {
                System.out.println("cannot move");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
