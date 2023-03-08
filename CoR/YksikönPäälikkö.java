package CoR;

public class YksikönPäälikkö extends Esimies{

    @Override
    public boolean korotaPalkkaa(double prosentti) {
        if (prosentti < 5.0) {
            System.out.println("Yksikön päälikkö hyväksyy palkankorotuksen!");
            return true;
        } else {
            System.out.println("Päälikkö ei uskalla luvata. Kysytään korkeammalta...");
            return super.korotaPalkkaa(prosentti);
        }
    }
}
