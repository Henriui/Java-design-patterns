package Mediator.Hyppyjäbä;

import Mediator.Mediator;

public class Hyppääjä {
private double[][] hyppy = new double[2][2];
    Mediator m;

    public Hyppääjä(Mediator m) {
        this.m = m;
    }

    public void hyppää() {
        m.aloitaHyppy();
        
    }

    public void talletaHyppy() {
        if(hyppy[0][0] == 0 && hyppy[0][1] == 0){
            hyppy[0][0] = m.haeHyppy().getHyppy();
            hyppy[0][1] = m.haeHyppy().getPisteet();
            return;
        }
        hyppy[1][0] = m.haeHyppy().getHyppy();
        hyppy[1][1] = m.haeHyppy().getPisteet();
    }

    public double getIsoinHyppy(){
        if (hyppy[0][0] > hyppy[1][0]) {
            return 1;
        }
        return 2;
    }
    
    public double getHyppyPisteet(){
        if (hyppy[0][1] > hyppy[1][1]) {
            return hyppy[0][1];
        }
    return hyppy[1][1];
    }

    public double getIsoinHyppyPituus(){
        if (hyppy[0][0] > hyppy[1][0]) {
            return hyppy[0][0];
        }
        return hyppy[1][0];
    }
}
