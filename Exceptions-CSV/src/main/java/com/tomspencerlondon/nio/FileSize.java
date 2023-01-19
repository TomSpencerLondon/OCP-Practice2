package com.tomspencerlondon.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.text.DecimalFormat;

public class FileSize {

    public static void main(String[] args) throws IOException {
        String filename = "src/main/resources/other/newTest.csv";

        Path path = Paths.get(filename);

        UserPrincipal owner = Files.getOwner(path);

        String name = owner.getName();

        System.out.println(name);
        long bytes = 0;
        try {
            bytes = Files.size(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("%,d bytes", bytes));
        double kilobytes = ((double) bytes) / 1024;

        System.out.printf("Size in kilobytes %.2f", kilobytes);
    }
}
