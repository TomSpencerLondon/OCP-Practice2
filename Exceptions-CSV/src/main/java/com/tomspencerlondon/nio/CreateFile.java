package com.tomspencerlondon.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        // 1. copy a file to the new directory
        // 2. move a file to the new directory
        String filename = "src/main/resources/DataTradeClients.csv";
        Files.copy(Path.of(filename), Path.of("src/main/resources/other/DataTradeClientsCopy.csv"), StandardCopyOption.REPLACE_EXISTING);

        String filename2 = "src/main/resources/other/DataTradeClients.csv";
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
