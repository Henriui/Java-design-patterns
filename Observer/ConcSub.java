package Observer;

public class ConcSub implements Sub {
    private float temp;
    private Obs[] observers;
    private int numObservers;
    
    public ConcSub(){
        observers = new Obs[10];
        numObservers = 0;
    }
    
    // attach an observer to the subject
    public void attach(Obs o){
        observers[numObservers] = o;
        numObservers++;
    }
    // detach an observer from the subject
    public void detach(Obs o){
        for(int i = 0; i < numObservers; i++){
            if(observers[i] == o){
                for(int j = i; j < numObservers - 1; j++){
                    observers[j] = observers[j + 1];
                }
                numObservers--;
            }
        }
    }
    // notify all observers about an event
    public void notifyObservers(){
        for(int i = 0; i < numObservers; i++){
            observers[i].update(this);
        }
    }
    
    public void setTemp(float temp){
        this.temp = temp;
    }
    public float getstate() { return temp; }

}
