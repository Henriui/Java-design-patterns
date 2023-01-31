package Observer;
public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        Clock clock1 = new Clock(timer);
        Clock clock2 = new Clock(timer);
        Clock clock3 = new Clock(timer);
        
        timer.attach(clock1);
        timer.attach(clock2);
        timer.attach(clock3);

        timer.tick();

        timer.detach(clock1);

        timer.tick();

        timer.detach(clock2);

        for (int i = 0; i < 60; i++) {
            timer.tick();
        }
    }
}
