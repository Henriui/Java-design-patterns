package Builder.Hese;

import Builder.HamppariBuilder;


public class HeseBuilder extends HamppariBuilder{

    private StringBuilder x = new StringBuilder();

    @Override
    public void buildBurger() {
        new RuisSämpylä().setSämpylä(x);
        new KanaPihvi().setPihvi(x);
        burger.buildBurger(x.toString());
    }

}

class KanaPihvi {
    public void setPihvi(StringBuilder x) {
        x.append("KanaPihvi ");
    }
}

class RuisSämpylä {
    public void setSämpylä(StringBuilder x) {
        x.append("Ruissämpylä ");
    }
}
