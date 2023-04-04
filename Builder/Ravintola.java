package Builder;

public class Ravintola {
    HamppariBuilder builder;

    public void setBuilder(HamppariBuilder builder) {
        this.builder = builder;
    }
    
    public Burger getHamppari() {

        builder.addPihvi();
        builder.addSämpylä();
        builder.build();
        return builder.getBurger();
    }

}
