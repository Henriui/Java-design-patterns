package Visitor.State;

public class LevelTwo implements State {

    PlayerContext p;
    private int levelup = 0;

    public LevelTwo(PlayerContext p) {
        this.p = p;
    }
    public void nextLevel() {
        p.setState(new LevelThree(p));
    }
    
    public int currentLevel() {
        return 2;
    }

    public int playGame() {
        System.out.println("Playing game at level 2...");
        levelup++;
        if(levelup == 3){
            nextLevel();
        }

    return 40;
    }

    public LevelTwo calcBonus() {
        return this;
    }
}
