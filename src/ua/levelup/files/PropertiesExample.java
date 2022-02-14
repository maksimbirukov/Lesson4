package ua.levelup.files;

public class PropertiesExample {

    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.format("os.name = %s%n", os);

        System.out.format("System properties FILE_1 = %s, FILE_2 = %s%n",
                System.getProperty("FILE_1"),
                System.getProperty("FILE_2"));

        System.out.format("Env variables FILE_1 = %s, FILE_2 = %s%n",
                System.getenv("FILE_1"),
                System.getenv("FILE_2"));
    }
}
