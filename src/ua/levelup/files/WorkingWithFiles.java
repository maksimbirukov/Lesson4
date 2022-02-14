package ua.levelup.files;

import java.util.Date;
import java.util.Locale;

public class WorkingWithFiles {

    public static final String ARRAY1_FILE_NAME = "Arrays1.txt";
    public static final String ARRAY2_FILE_NAME = "Arrays2.txt";
    public static final String DATA_FILE_NAME = "Data.bin";

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // 1. FileReaderExample
        FileReaderExample fileReaderExample = new FileReaderExample();
        // 1.a write to file
        fileReaderExample.writeToFile(ARRAY1_FILE_NAME, "1;1,2;1,2,3;1,2,3,4;1,2,3,4,5;");
        // 1.b read from file
        StringBuilder stringBuilder = fileReaderExample.readFromFile(ARRAY1_FILE_NAME);
        System.out.format("%s%n", stringBuilder);

        // 2. FileInputStreamExample
        FileInputStreamExample fileInputStreamExample = new FileInputStreamExample();
        // 2.a write to file
        fileInputStreamExample.writeToFile(ARRAY2_FILE_NAME, "Let's store to file some text data " + new Date());
        byte[] bytes = fileInputStreamExample.readFromFile(ARRAY2_FILE_NAME);
        System.out.format("%s%n", new String(bytes));

        DataStreamExample dataStreamExample = new DataStreamExample();
//        // 3a. DataOutputStream write to file
        dataStreamExample.writeToFile(DATA_FILE_NAME);
//        // 3b. DataInputStream read from file
        dataStreamExample.readFromFile(DATA_FILE_NAME);


        ZipArchiveExample zipArchiveExample = new ZipArchiveExample();
        //4.a ZipArchive save to zip
        zipArchiveExample.saveToZipArchive();

        //4.b ZipArchive read from zip
        zipArchiveExample.readFromZipArchive();

    }


}
