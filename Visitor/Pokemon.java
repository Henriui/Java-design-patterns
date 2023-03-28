package Visitor;

public class Pokemon {
    EvoVisitor v = new EvoVisitor();

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


}
