package Visitor;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        for (int i = 0; i <4; i++) {
            pokemon.attack();
            pokemon.specialAttack();
            pokemon.defend();
            
        }
    }
}
