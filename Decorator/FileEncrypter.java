package Decorator;

import java.util.Base64;

public class FileEncrypter extends FileIODecorator {
    public FileEncrypter(FileIO fileIO) {
        super(fileIO);
    }

    @Override
    public String readFromFile(String filename) {
        // read from file
        String encryptedString = super.readFromFile(filename);
        // decrypt the content
        String decryptedContent = decrypt(encryptedString);
        // print the content
        System.out.println("Read from file successfully decrypted");
        return decryptedContent;
    }

    @Override
    public void writeToFile(String filename, String content) {
        // encrypt the content
        String encryptedContent = encrypt(content);
        // write to file
        super.writeToFile(filename, encryptedContent);
        
        System.out.println("Write to file successfully encrypted");

    }

    private String decrypt(String content) {
        StringBuilder tmp = new StringBuilder();
        final int OFFSET = 4;
        for (int i = 0; i < content.length(); i++) {
           tmp.append((char)(content.charAt(i) - OFFSET));
        }
        String reversed = new StringBuffer(tmp.toString()).reverse().toString();
        String sss = new String(Base64.getDecoder().decode(reversed));

        return (sss);
    }

    private String encrypt(String content) {
        String b64encoded = Base64.getEncoder().encodeToString(content.getBytes());

        // Reverse the string
        String reverse = new StringBuffer(b64encoded).reverse().toString();

        StringBuilder tmp = new StringBuilder();
        final int OFFSET = 4;
        for (int i = 0; i < reverse.length(); i++) {
            tmp.append((char) (reverse.charAt(i) + OFFSET));
        }
        return tmp.toString();
    }

}
