package State;

public class Pokemon {

    Evolution evolution = new Charmander();

    public void evolvePokemon() {
        evolution.evolve(this);
    }

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
