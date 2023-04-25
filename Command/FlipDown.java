package Command;

public class FlipDown implements ICommand {
    
    private Screen s;

    public FlipDown(Screen screen) {
        this.s = screen;
    }

    @Override
    public void execute() {
        s.down();
    }
}
