package Memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Arvaaja[] arvaaja = new Arvaaja[5];

        for (int i = 0; i < arvaaja.length; i++) {
            arvaaja[i] = new Arvaaja("arvaaja " + i + "");
            arvaaja[i].liityPeliin(arvuuttaja);
        }
        for (int i = 0; i < arvaaja.length; i++) {
            arvaaja[i].start();
        }
    }
}
