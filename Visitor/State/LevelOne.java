package Visitor.State;

public class LevelOne implements State{

    private int levelup = 0;
    PlayerContext p;

    public LevelOne(PlayerContext p){
        this.p = p;
    }

    public void nextLevel(){
        p.setState(new LevelTwo(p));
    }

    public int currentLevel() {
        return 1;
    }

    public int playGame() {
        System.out.println("Playing game at level 1...");
        levelup++;
        if(levelup == 3){
            nextLevel();
        }
        return 20;
    }

    public LevelOne calcBonus() {
        return this;
    }
}
