package Builder;

public class Ravintola {
    HamppariBuilder builder;

    public void setBuilder(HamppariBuilder builder) {
        this.builder = builder;
    }
    
    public Burger getHamppari() {

        builder.buildBurger();
        return builder.getBurger();
    }

}
