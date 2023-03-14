package CoR;

public class Lähiesimies extends Esimies{

    @Override
    public boolean korotaPalkkaa(double prosentti) {
        if (prosentti < 2.0) {
            System.out.println("Lähiesimies hyväksyy palkankorotuksen!");
            return true;
        } else {
            System.out.println("Lähiesimiehellä ei riitä nappulat. Kysytään korkeammalta...");
            return super.korotaPalkkaa(prosentti);
        }
    }
}
