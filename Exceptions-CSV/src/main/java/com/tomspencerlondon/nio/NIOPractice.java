package com.tomspencerlondon.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NIOPractice {

    public static void main(String[] args) {
        String filename = "src/main/resources/testOut5.csv";
        Path path = Path.of(filename);

        String patternDate = "yyyy-MM-dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(patternDate);

        String patternTime = "HH:mm:ss";
        SimpleDateFormat timeFormat = new SimpleDateFormat(patternTime);

        BasicFileAttributes attrs;

        try {
            attrs = Files.readAttributes(path, BasicFileAttributes.class);
            FileTime time1 = attrs.lastAccessTime();
            FileTime time2 = attrs.creationTime();
            FileTime time3 = attrs.lastModifiedTime();

            System.out.println(dateFormat.format(time1.toMillis()) + " time " + timeFormat.format(time1.toMillis()));
            System.out.println(dateFormat.format(time2.toMillis()) + " time " + timeFormat.format(time2.toMillis()));
            System.out.println(dateFormat.format(time3.toMillis()) + " time " + timeFormat.format(time3.toMillis()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(Files.getLastModifiedTime(path));
            attrs = Files.readAttributes(path, BasicFileAttributes.class);

            FileTime time1 = attrs.lastAccessTime();
            String fileCreationDate = dateFormat.format(time1.toMillis());
            Date date = new Date(time1.toMillis());
            String fileCreationDate2 = dateFormat.format(date);
            System.out.println("The file creation date and time is: " + fileCreationDate + "\n" + fileCreationDate2);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
