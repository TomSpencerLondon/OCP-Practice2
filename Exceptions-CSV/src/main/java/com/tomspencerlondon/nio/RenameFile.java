package com.tomspencerlondon.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class RenameFile {
    public static void main(String[] args) {
        String path = "src/main/resources/other/testOut5.csv";

        Path source = Paths.get(path);

        try {
            Files.move(source, source.resolveSibling("newTest.csv"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
