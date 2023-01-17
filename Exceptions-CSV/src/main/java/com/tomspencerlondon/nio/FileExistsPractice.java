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

        String projectFolder = System.getProperty("user.dir");
        System.out.println("The project folder directory is  " + projectFolder);
        Path path = Paths.get(projectFolder);
        System.out.println("path.toAbsolutePath() " + path.toAbsolutePath());

        String filename2 = "src/main/resources/testOut5.csv";
        Path path2 = Paths.get(filename2);
        System.out.println("Path 2: " + path2);

        System.out.println("Path to absolute path " + path2.toAbsolutePath());

        System.out.println("Path parent " + path2.getParent());

        System.out.println("Path root " + path2.getRoot());
    }
}
