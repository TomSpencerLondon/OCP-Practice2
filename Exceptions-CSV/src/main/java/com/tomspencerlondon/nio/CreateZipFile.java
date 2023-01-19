package com.tomspencerlondon.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipFile {

    public static void main(String[] args) throws IOException {
        String filename = "src/main/resources/other/DataTradeClients.csv";
        FileInputStream fileInputStream = new FileInputStream(filename);
        ZipEntry zipEntry = new ZipEntry(filename);

        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/other/data.zip");
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);

        try {
            zipOutputStream.putNextEntry(zipEntry);
            byte[] buffer = new byte[1024];
            while ((fileInputStream.read(buffer)) > 0) {
                zipOutputStream.write(buffer);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        zipOutputStream.close();
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("done");
    }
}
