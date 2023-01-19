package com.tomspencerlondon.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFolder {

    public static void main(String[] args) {
        String folder = "src/main/resources/other";

        Path source = Paths.get(folder);

        try {
            Files.createDirectories(source);
            System.out.println("Directory is created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
