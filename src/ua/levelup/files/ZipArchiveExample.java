package ua.levelup.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import static ua.levelup.files.WorkingWithFiles.ARRAY2_FILE_NAME;
import static ua.levelup.files.WorkingWithFiles.DATA_FILE_NAME;

public class ZipArchiveExample {

    public void saveToZipArchive() {
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("Archive.zip"));
            ZipEntry zipEntry1 = new ZipEntry(ARRAY2_FILE_NAME);
            zipOutputStream.putNextEntry(zipEntry1);
            zipOutputStream.write(new FileInputStreamExample().readFromFile(ARRAY2_FILE_NAME));

            ZipEntry zipEntry2 = new ZipEntry(DATA_FILE_NAME);
            zipOutputStream.putNextEntry(zipEntry2);
            FileInputStream fileInputStream = new FileInputStream(DATA_FILE_NAME);
            int available = fileInputStream.available();
            byte[] buff = new byte[available];
            fileInputStream.read(buff);
            zipOutputStream.write(buff);
            zipOutputStream.finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromZipArchive() {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("Archive.zip"));
            ZipEntry nextEntry;
            while ((nextEntry = zipInputStream.getNextEntry()) != null) {
                System.out.format("%nZip Entry %s%n", nextEntry.getName());
                int next;
                while ((next = zipInputStream.read()) != -1) {
                    System.out.print(next);
                }
                System.out.format("%nEnd of %s%n", nextEntry.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
