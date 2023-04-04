package Builder.Mäkkäri;

import java.util.ArrayList;

import Builder.HamppariBuilder;

public class MäkkäriBuilder extends HamppariBuilder {

    private ArrayList<Object> x = new ArrayList<>();

    @Override
    public void buildBurger() {
        x.add(new VehnäSämpylä());
        x.add(new NautaPihvi());

        String burgerContents = "";
        for (Object object : x) {
            burgerContents += object.toString();
        }

        burger.buildBurger(burgerContents);
    }

}

class NautaPihvi {
    private String pihvi = "NautaPihvi";

    @Override
    public String toString() {
        return pihvi;
    }
}

class VehnäSämpylä {
    private String sämpylä = "Vehnäsämpylä";

    @Override
    public String toString() {
        return sämpylä;
    }

}
