package CoR;
// Abstract class for the chain of responsibility
public abstract class Esimies {
    private Esimies seuraavaEsimies;

    public void setSeuraavaEsimies(Esimies seuraavaEsimies) {
        this.seuraavaEsimies = seuraavaEsimies;
    }

    public boolean korotaPalkkaa(double prosentti) {
       
        if (seuraavaEsimies != null) {
            seuraavaEsimies.korotaPalkkaa(prosentti);
        }
        return false;
    }

}
