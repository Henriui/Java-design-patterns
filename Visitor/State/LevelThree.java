package Visitor.State;

public class LevelThree implements State{

    public LevelThree(PlayerContext p){

    }

    public void nextLevel() {
        System.out.println("You are at max level");
    }
    
    public int currentLevel() {
        return 3;
    }

    public int playGame() {
        System.out.println("Playing game at level 3... (Max level)");

        return 70;
        
    }

    public LevelThree calcBonus() {
        return this;
    }
}
