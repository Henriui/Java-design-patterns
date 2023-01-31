package Observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
    Set<Observer> observer = new HashSet();

    public void attach(Observer o) {
        observer.add(o);
    }

    public void detach(Observer o) {
        observer.remove(o);
    }
    
    protected void notifyObservers() {
        for (Observer o : observer) {
            o.update(this);
        }
    }
}
