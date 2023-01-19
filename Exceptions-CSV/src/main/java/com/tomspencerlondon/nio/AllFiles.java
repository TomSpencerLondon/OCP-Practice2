package com.tomspencerlondon.nio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AllFiles {

    public static void main(String[] args) {
        String filename = "src/main/resources/other";
        File folder = new File(filename);

        File[] files = folder.listFiles();

        System.out.println("file count in the folder: " + files.length);

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
