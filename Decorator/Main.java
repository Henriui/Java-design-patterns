package Decorator;

public class Main {
    public static void main(String[] args) {
        // Create an implementation of FileIO and decorate it with FileEncrypter.
        FileIO fileIO = new FileEncrypter(new FileIOImpl());

        // Write Hello World to file.
        fileIO.writeToFile("test.txt", "Hello World");

        // Read it from file.
        String content = fileIO.readFromFile("test.txt");

        // Print the content.
        System.out.println("Content: " + content);
    }
}
