package Visitor;


public interface Visitor {
    void visit(Charmander visitable, Pokemon pokemon);

    void visit(Charmeleon visitable, Pokemon pokemon);

    void visit(Charizard visitable, Pokemon pokemon);
}
