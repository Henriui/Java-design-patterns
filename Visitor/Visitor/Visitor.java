package Visitor.Visitor;

import Visitor.State.LevelOne;
import Visitor.State.*;

public interface Visitor {
    public int visit(LevelOne visitable);
    public int visit(LevelTwo visitable);
    public int visit(LevelThree visitable);
}
