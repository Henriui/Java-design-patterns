package Mediator;

import Mediator.Hyppyjäbä.Hyppääjä;

public class Main {

    public static void main(String[] args) {
        Mediator m = new Mediator();

        for (int i = 0; i < 3; i++) {
            m.addHyppääjä(new Hyppääjä(m));
        }

        m.kisaa();

    }
}
