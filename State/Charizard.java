package State;

public class Charizard implements Evolution {

    public Charizard() {
        System.out.println("Charmeleon evolved into Charizard");
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Charizard is already at its final evolution!");
    }

    public void attack() {
        System.out.println("Charizard used Blast Burn!");
    }

    public void specialAttack() {
        System.out.println("Charizard used Dragon Pulse!");
    }

    public void defend() {
        System.out.println("Charizard used Fly!");
    }

}
