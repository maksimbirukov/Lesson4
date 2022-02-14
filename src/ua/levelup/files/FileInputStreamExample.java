package ua.levelup.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public byte[] readFromFile(String fileName) {

            try(FileInputStream fis = new FileInputStream(fileName)) {
                int available = fis.available();
                byte[] buffer = new byte[available];

                int read = fis.read(buffer);
                System.out.format("was read %d bytes%n", read);
                return buffer;
            } catch (IOException e) {
                e.printStackTrace();
            }


        return new byte[]{};
    }

    public void writeToFile(String fileName, String s) {
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
