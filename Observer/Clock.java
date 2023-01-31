package Observer;

public class Clock implements Observer{

    private Timer timer;

    public Clock(Timer timer) {
        this.timer = timer;
        timer.attach(this);
    }

    @Override
    public void update(Subject theChangedSubject) {
        if (theChangedSubject == timer) {
            draw();
        }
    }

    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println("DigitalClock: " + hour + ":" + minute + ":" + second);
    }
}
