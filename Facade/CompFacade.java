package Facade;

public class CompFacade {
    private Cpu cpu;
    private Memory memory;
    private Hdd hdd;

    public CompFacade() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hdd = new Hdd();
    }

    public void start() {
        cpu.freeze();

        for (int i = 0; i < 10; i++) {
            memory.load(i, hdd.read(i));
        }

        cpu.jump(0);
        cpu.execute();
    }
}
