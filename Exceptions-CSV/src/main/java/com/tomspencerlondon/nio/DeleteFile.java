package com.tomspencerlondon.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

    public static void main(String[] args) {
        String filename = "src/main/resources/other/DataTradeClients.csv";
        String filename2 = "src/main/resources/other/DataTradeClients1.csv";

        Path path = Paths.get(filename);
        Path path2 = Paths.get(filename2);

        try {
            boolean result = Files.deleteIfExists(path);

            if (result) {
                System.out.println("File is deleted!");
            } else {
                System.out.println("Sorry, unable to delete file.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.delete(path2);
            System.out.println("Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
