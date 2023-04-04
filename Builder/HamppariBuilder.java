package Builder;

public abstract class HamppariBuilder {

    protected Burger burger = new Burger();

    public Burger getBurger() {

        return burger;
    }

    public abstract void addPihvi();
    public abstract void addSämpylä();
    public abstract void build();
}
