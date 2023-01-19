package com.tomspencerlondon.nio;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFile {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        ZipInputStream zipInputStream = null;
        ZipEntry zipEntry = null;

        try {
            fileInputStream = new FileInputStream("src/main/resources/other/data.zip");
            zipInputStream = new ZipInputStream(new BufferedInputStream(fileInputStream));

            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                byte[] bytes = new byte[1024];
                fileOutputStream = new FileOutputStream("src/main/resources/other/example.csv");
                int size = 0;

                while ((size = zipInputStream.read()) != -1) {
                    fileOutputStream.write(bytes, 0, size);
                }

                fileOutputStream.flush();
                fileOutputStream.close();
            }

            zipInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
