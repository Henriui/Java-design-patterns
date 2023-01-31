package Observer;

public interface Sub {
    
    // attach an observer to the subject
    public void attach(Obs o);
    // detach an observer from the subject
    public void detach(Obs o);
    // notify all observers about an event
    public void notifyObservers();
}
