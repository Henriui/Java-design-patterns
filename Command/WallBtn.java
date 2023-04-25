package Command;

public class WallBtn {
    
    private ICommand command;
    
    public WallBtn(ICommand command) {
        this.command = command;
    }
    
    public void press() {
        command.execute();
    }
}
