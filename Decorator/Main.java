package Decorator;

public class Main {
    // Test variables.
    private static String test1 = "test1.txt", test2 = "test2.txt", testString = "Hello World";

    public static void main(String[] args) {
        // Create an implementation of FileIO and read + write to file without encryption

        FileIO fileIOimpl = new FileIOImpl();
        fileIOimpl.writeToFile(test1, testString);
        String contentimpl = fileIOimpl.readFromFile(test1);
        System.out.println("Content: " + contentimpl);

        // Create an implementation of FileIO and decorate it with FileEncrypter.
        // Write Hello World to file encrypted and read it back decrypted.

        FileIO fileIO = new FileEncrypter(new FileIOImpl());
        fileIO.writeToFile(test2, testString);
        String content = fileIO.readFromFile(test2);
        System.out.println("Content: " + content);
    }
}
