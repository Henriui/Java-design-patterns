package Observer;

public interface Obs {
    // This is the method that the Subject will call
    // when the Observer needs to be updated.
    public void update(Sub subject);
}