package State;

public class Charmander implements Evolution {

    public Charmander() {
        System.out.println("You have a Charmander!");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Charmander is evolving...");
        pokemon.setState(new Charmeleon());
    }

    public void attack() {
        System.out.println("Charmander used Ember!");
    }

    public void specialAttack() {
        System.out.println("Charmander used Fire Fang!");
    }

    public void defend() {
        System.out.println("Charmander used Growl!");
    }
}
