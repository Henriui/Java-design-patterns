package Facade;

public class Hdd {
    private String[] data = new String[100];

    public Hdd() {
        for (int i = 0; i < data.length; i++) {
            data[i] = " File nr " + String.valueOf(i);
        }
    }

    public String read(long x) {
        System.out.println("Hdd read file " + x);
        return data[(int) x];
    }
}
