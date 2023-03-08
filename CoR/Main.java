package CoR;

public class Main {
    public static void main(String[] args) {
        Esimies esimies = new Lähiesimies();
        Esimies esimies2 = new YksikönPäälikkö();
        Esimies esimies3 = new Toimitusjohtaja();
        esimies.setSeuraavaEsimies(esimies2);
        esimies2.setSeuraavaEsimies(esimies3);

        esimies.korotaPalkkaa(1.1);

        esimies.korotaPalkkaa(4.99);

        esimies.korotaPalkkaa(5);
    }
}
