package State;

public class Charmeleon implements Evolution {

    public Charmeleon() {
        System.out.println("Charmander evolved into Charmeleon!");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Charmeleon is evolving...");
        pokemon.setState(new Charizard());
    }
    
    public void attack() {
        System.out.println("Charmeleon used Flamethrower!");
    }
    public void specialAttack() {
        System.out.println("Charmeleon used Fire Spin!");
    }
    
    public void defend() {
        System.out.println("Charmeleon used Defense Curl!");
    }
}
