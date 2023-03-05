package Template;

public class RulettiKone {

    private int ruletinArvo;
    public RulettiKone() {
        ruletinArvo = (int) (Math.random() * 6);
        System.out.println("RulettiKone luotu.");

    }
    
    public boolean pyorita() {
        System.out.println("ruletti pyörii..");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        int arvo = (int) (Math.random() * 6);
        return arvo == ruletinArvo;
    }
}
