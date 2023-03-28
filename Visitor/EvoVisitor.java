package Visitor;

public class EvoVisitor implements Visitor {
    public void visit(Charmander visitable, Pokemon pokemon) {
        System.out.println("Charmander is evolving...");
        pokemon.setState(new Charmeleon(this, pokemon));
    }

    public void visit(Charmeleon visitable, Pokemon pokemon) {
        System.out.println("Charmeleon is evolving...");
        pokemon.setState(new Charizard());
    }

    public void visit(Charizard visitable, Pokemon pokemon) {
                System.out.println("Charizard is already at its final evolution!");

    }

}
