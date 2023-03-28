package Visitor;

public class Charizard implements Evolution {
    Pokemon p;
    Visitor v;

    public Charizard(Visitor v, Pokemon pokemon) {
        p = pokemon;
        this.v = v;
        System.out.println("Charmeleon evolved into Charizard!");
    }

    public void attack() {
        System.out.println("Charizard used Blast Burn!");
        p.addXp(1);
        v.visit(this, p);
    }

    public void specialAttack() {
        System.out.println("Charizard used Dragon Pulse!");
        p.addXp(1);
        v.visit(this, p);
    }

    public void defend() {
        System.out.println("Charizard used Fly!");
        p.addXp(1);
        v.visit(this, p);
    }

}
