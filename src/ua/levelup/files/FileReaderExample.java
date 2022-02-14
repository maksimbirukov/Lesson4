package ua.levelup.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {

    public StringBuilder readFromFile(String fileName) {
        File file = new File(fileName);

        StringBuilder stringBuilder = new StringBuilder();
        if (file.exists()) {
            try {
                try (FileReader fileReader = new FileReader(file)) {
                    int read;
                    while ((read = fileReader.read()) != -1) {  //EOF
                        stringBuilder.append((char) read);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return stringBuilder;
    }

    public void writeToFile(String fileName, String data) {
        File file = new File(fileName);

        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
