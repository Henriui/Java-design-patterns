package Visitor;

public class Charmander implements Evolution {

    int xp = 0;
    Pokemon p;
    Visitor v;
    
    public Charmander(Visitor v, Pokemon pokemon) {
        p = pokemon;
        this.v = v;
        System.out.println("You have a Charmander!");
    }

    public void attack() {
        System.out.println("Charmander used Ember!");
        p.addXp(1);
        v.visit(this, p);
    }

    public void specialAttack() {
        System.out.println("Charmander used Fire Fang!");
        p.addXp(1);
        v.visit(this, p);
    }

    public void defend() {
        System.out.println("Charmander used Growl!");
        p.addXp(1);
        v.visit(this, p);
    }
}
