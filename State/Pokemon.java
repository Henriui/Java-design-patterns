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

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        for (int i = 0; i < 3; i++) {
            pokemon.attack();
            pokemon.specialAttack();
            pokemon.defend();
            pokemon.evolvePokemon();
        }
    }

}
