package ua.levelup.files;

import java.io.*;

public class DataStreamExample {

    public void writeToFile(String fileName) {
        try {
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
                dataOutputStream.writeInt(305);
                dataOutputStream.writeUTF("DataStreamExample");
                dataOutputStream.writeDouble(10.0);
            }
            System.out.println("Saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String fileName) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName));
            try {
                System.out.format("Read from file %s%n", fileName);
                int available = dataInputStream.available();
                if (available > 0) {
                    int intValue = dataInputStream.readInt();
                    String stringValue = dataInputStream.readUTF();
                    double doubleValue = dataInputStream.readDouble();
                    System.out.format("int value = %d, UTF = %s, double = %.2f%n", intValue, stringValue, doubleValue);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
