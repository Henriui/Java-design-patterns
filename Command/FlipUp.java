package Command;

public class FlipUp implements ICommand{
    private Screen s;
    public FlipUp(Screen s) {
        this.s = s;
    }
    @Override
    public void execute() {
        s.up();
    }
}
