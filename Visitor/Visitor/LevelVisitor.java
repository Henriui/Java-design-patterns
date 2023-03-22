package Visitor.Visitor;

import Visitor.State.LevelOne;
import Visitor.State.LevelThree;
import Visitor.State.LevelTwo;

public class LevelVisitor implements Visitor{

    @Override
    public int visit(LevelOne visitable) {
        return 100;
    }

    @Override
    public int visit(LevelTwo visitable) {
       return 300;
    }

    @Override
    public int visit(LevelThree visitable) {
        return 500;
    }

    
}
