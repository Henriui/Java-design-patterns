package Builder.Hese;

import Builder.HamppariBuilder;


public class HeseBuilder extends HamppariBuilder{

    private StringBuilder x = new StringBuilder();

    @Override
    public void build() {
        burger.buildBurger(x.toString());
    }
    
    @Override
    public void addPihvi() {
        new KanaPihvi().setPihvi(x);
    }

    @Override
    public void addSämpylä() {
        new RuisSämpylä().setSämpylä(x);
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
