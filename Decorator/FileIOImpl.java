package Decorator;

import java.io.*;

public class FileIOImpl implements FileIO {
    @Override
    public String readFromFile(String filename) {
        String content = "";
        File file = new File(filename);
        try (FileInputStream fis = new FileInputStream(file)) {
            // read from file
            byte[] bytes = new byte[fis.available()];

            // reads 8192 bytes at a time, if end of the file, returns -1
            while (fis.read(bytes) != -1) {

                // convert bytes to string for demo
                content = new String(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
    
    // implement write a file
    @Override
    public void writeToFile(String filename, String content) {
        File file = new File(filename);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            // write to file
            fos.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
