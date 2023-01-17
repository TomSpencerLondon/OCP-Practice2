package com.tomspencerlondon.nio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

public class FileExistsPractice {

    public static void main(String[] args) throws IOException {
        String filename = "src/main/resources/testOut5.csv";

        Path source = Paths.get(filename);

        if (Files.notExists(source)) {
            System.out.println("file is not there");
        }

        if (Files.exists(source)) {
            System.out.println("file is there");
        }

        UserPrincipal owner = Files.getOwner(source);

        System.out.println(owner.getName());

        long size = Files.size(source);

        System.out.println(size);
    }
}
