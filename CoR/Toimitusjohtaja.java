package CoR;

public class Toimitusjohtaja extends Esimies {

    @Override
    public boolean korotaPalkkaa(double prosentti) {
        System.out.println("Toimitusjohtaja hyväksyy palkankorotuksen!");
        return true;
    }

}
