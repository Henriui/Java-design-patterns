package Decorator;

public interface FileIO {
    // Read a file
    public String readFromFile(String filename);
    // Write a file
    public void writeToFile(String filename, String content);
}
