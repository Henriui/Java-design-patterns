package Visitor;

public class Charmeleon implements Evolution {
    int xp = 0;
    Pokemon p;
    Visitor v;
    public Charmeleon(Visitor v, Pokemon pokemon) {
        p = pokemon;
        this.v = v;
        System.out.println("Charmander evolved into Charmeleon!");
    }
    
    public void attack() {
        System.out.println("Charmeleon used Flamethrower!");
        p.addXp(1);
        v.visit(this, p);
        
    }
    public void specialAttack() {
        System.out.println("Charmeleon used Fire Spin!");
        p.addXp(1);
        v.visit(this, p);
        
    }
    
    public void defend() {
        System.out.println("Charmeleon used Defense Curl!");
        p.addXp(1);
        v.visit(this, p);
    }
}
