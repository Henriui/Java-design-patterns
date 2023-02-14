package Decorator;

public abstract class FileIODecorator implements FileIO {
    // The decorated object is stored in this variable
    private FileIO fileIO;

    public FileIODecorator(FileIO fileIO) {
        this.fileIO = fileIO;
    }
    
    // implement read a file
    public String readFromFile(String filename) {
        String content = fileIO.readFromFile(filename);
        return content;
    }
    
    // implement write a file
    public void writeToFile(String filename, String content) {
        fileIO.writeToFile(filename, content);
    }


}
