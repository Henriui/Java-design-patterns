package Observer;

import java.io.Console;

public class ConcObs implements Obs {
    // This is the method that the Subject will call
    // when the Observer needs to be updated.
    private float state;
    public void update(Sub subject){
        ConcSub concSub = (ConcSub) subject;
        state = concSub.getstate();
        System.out.println("ConcObs: My subject changed and told me the new temp is " + state);
    }

}