package Observer;

public class Main {
    public static void main(String[] args){
        // create a subject
        ConcSub subject = new ConcSub();
        // create an observer
        Obs observer1 = new ConcObs();
        Obs observer2 = new ConcObs();
        Obs observer3 = new ConcObs();

        // attach the observer to the subject
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        // change the temperateure and notify observers
        subject.setTemp(-55f);
        subject.notifyObservers();

        // drop the second observer
        subject.detach(observer2);

        // change the temperature and notify observers
        subject.setTemp(100f);
        subject.notifyObservers();
    }
}
