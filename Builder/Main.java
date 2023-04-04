package Builder;

import Builder.Hese.HeseBuilder;
import Builder.Mäkkäri.MäkkäriBuilder;

public class Main {
    public static void main(String[] args) {
        Ravintola ravintola = new Ravintola();
        Burger b;
    
        ravintola.setBuilder(new HeseBuilder());
        b = ravintola.getHamppari();
        System.out.println("hese: " + b.print());

        ravintola.setBuilder(new MäkkäriBuilder());
        b = ravintola.getHamppari();
        System.out.println("mäkkäri: " +b.print());
    }
}
