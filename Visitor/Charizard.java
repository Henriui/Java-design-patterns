package Visitor;

public class Charizard implements Evolution {
<<<<<<< HEAD

    public Charizard() {
=======
    Pokemon p;
    Visitor v;

    public Charizard(Visitor v, Pokemon pokemon) {
        p = pokemon;
        this.v = v;
>>>>>>> 73a7232c8eec0171d740bb7fe29d687f2441b14d
        System.out.println("Charmeleon evolved into Charizard!");
    }

    public void attack() {
        System.out.println("Charizard used Blast Burn!");
<<<<<<< HEAD
=======
        p.addXp(1);
        v.visit(this, p);
>>>>>>> 73a7232c8eec0171d740bb7fe29d687f2441b14d
    }

    public void specialAttack() {
        System.out.println("Charizard used Dragon Pulse!");
<<<<<<< HEAD
=======
        p.addXp(1);
        v.visit(this, p);
>>>>>>> 73a7232c8eec0171d740bb7fe29d687f2441b14d
    }

    public void defend() {
        System.out.println("Charizard used Fly!");
<<<<<<< HEAD
=======
        p.addXp(1);
        v.visit(this, p);
>>>>>>> 73a7232c8eec0171d740bb7fe29d687f2441b14d
    }

}
