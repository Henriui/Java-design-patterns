package Composite;

public class Main {
    
        public static void main(String[] args) {
            
            // Make computer to build components in.
            Computer computer = new Computer("Computer", "Computer case", 100);

            // make expensive highend intel motherboard.
            Motherboard motherboard = new Motherboard("Intel", "Intel motherboard", 400);

            // Add components to motherboard.
            motherboard.addComponent(new Cpu("Intel", "Intel CPU", 300));
            motherboard.addComponent(new Ram("Corsair", "Corsair RAM", 150));
            motherboard.addComponent(new GraphicsCard("Nvidia", "Nvidia GPU", 1100));

            // Add motherboard to computer.
            computer.addComponent(motherboard);
            
            // print computer.
            System.out.println(computer);
            
            //print price of computer.
            System.out.println("Total Price: " + computer.getPrice());
        }
}
