package com.tomspencerlondon.nio;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFolder {
    public static void main(String[] args) {
        String folder = "src/main/resources/other";

        Path sourceFolder = Paths.get(folder);

        try {
            Files.delete(sourceFolder);
            System.out.printf("Directory is deleted : %s%n", folder);
        } catch (DirectoryNotEmptyException e) {
            System.out.println("Directory not empty");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
