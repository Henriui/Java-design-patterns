package Facade;

public class Cpu {
    public void freeze() {
        System.out.println("CPU freezes");
    }

    public void jump(long position) {
        System.out.println("CPU jumps to " + position);
    }

    public void execute() {
        System.out.println("CPU executes");
    }
}
