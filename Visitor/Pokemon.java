package Visitor;

public class Pokemon {
    EvoVisitor v = new EvoVisitor();
    int xp = 0;
    Evolution evolution = new Charmander(v, this);

    public void setState(Evolution x) {
        evolution = x;
    }

    public void attack() {
        evolution.attack();
    }

    public void specialAttack() {
        evolution.specialAttack();
    }

    public void defend() {
        evolution.defend();
    }

    public void addXp(int x) {
        xp += x;
    }

    public int getXp() {
        return xp;
    }

}
