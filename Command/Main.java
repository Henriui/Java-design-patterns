package Command;

public class Main {

    public static void main(String[] args) {

        // Create a new screen
        Screen screen = new Screen();

        // Create a new command
        ICommand flipup = new FlipUp(screen);
        ICommand flipdwn = new FlipDown(screen);

        // Create a new button
        WallBtn upBtn = new WallBtn(flipup);
        WallBtn dwnBtn = new WallBtn(flipdwn);

        // Press the button
        upBtn.press();
        dwnBtn.press();
        
    }
}
