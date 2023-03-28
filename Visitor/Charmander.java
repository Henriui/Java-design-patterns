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
        xp++;
        if (xp == 2) {
            v.visit(this, p);
        }
    }

    public void specialAttack() {
        System.out.println("Charmander used Fire Fang!");
    }

    public void defend() {
        System.out.println("Charmander used Growl!");
    }
}
