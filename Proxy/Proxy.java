package Proxy;

import java.util.ArrayList;
import java.util.Scanner;

interface Image {
    public void displayImage();

    public void showData();
}

// On System A
class RealImage implements Image {
    private final String filename;

    /**
     * Constructor
     * 
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    /**
     * OSA 1: Lisää showData
     */
    public void showData() {
        System.out.println("Data of " + filename);
    }
}

// On System B
class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    /**
     * Constructor
     * 
     * @param filename
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }

    public void showData() {
        System.out.println("Data of " + filename);
    }
}

class Proxy {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {

        // Valokuva-kansio

        ArrayList<Image> imageFolder = new ArrayList<>();

        // Lisätään kuvat

        imageFolder.add(new ProxyImage("HiRes_10MB_Photo1"));
        imageFolder.add(new ProxyImage("HiRes_10MB_Photo2"));
        imageFolder.add(new ProxyImage("HiRes_10MB_Photo3"));
        imageFolder.add(new ProxyImage("HiRes_10MB_Photo4"));
        imageFolder.add(new ProxyImage("HiRes_10MB_Photo5"));

        // Kuvien selaus:
        String command = "";
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("Selaa kuvia: A = edellinen, D = seuraava, S = näytä data, E = Lataa kuva, Q = lopeta");
            command = scanner.nextLine().toUpperCase();
            switch (command) {
                case "A":
                    if (i != 0) {
                        i -= 1;
                    }
                    break;
                case "D":
                    if (i < imageFolder.size() - 1) {
                        i++;
                    }
                    break;
                case "S":
                    imageFolder.get(i).showData();
                    break;
                case "E":
                    imageFolder.get(i).displayImage();
                    break;
                case "Q":
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
