package Visitor;

public class EvoVisitor implements Visitor {
    public void visit(Charmander visitable, Pokemon pokemon) {
        if (pokemon.getXp() == 2)
        {
            System.out.println("Charmander is evolving...");
            pokemon.setState(new Charmeleon(this, pokemon));
        }
    }

    public void visit(Charmeleon visitable, Pokemon pokemon) {
        if (pokemon.getXp() == 6)
        {
            System.out.println("Charmeleon is evolving...");
            pokemon.setState(new Charizard(this, pokemon));
        }
    }

    public void visit(Charizard visitable, Pokemon pokemon) {
        System.out.println("Charizard is already at its final evolution!");

    }

}
