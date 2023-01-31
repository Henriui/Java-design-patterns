package Composite;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Component {
    
        // name of the component
        private String name;
        
        // description of the component
        private String description;
        
        // price of the component
        private double price;
        
        // Array of leaf and composite components
        private List<Component> components = new ArrayList<>();

        // constructor
        public Computer(String name, String description, double price){
            this.name = name;
            this.description = description;
            this.price = price;
        }
        
        // returns the price of the component
        public double getPrice(){
            // get price of components and add to total price.
            for (Component component : components) {
                price += component.getPrice();
            }
            return price;
        }
        
        // returns the name of the component
        public String getName(){
            return name;
        }
        
        // returns the description of the component 
        public String getDescription(){
            return description;
        }
        
            
    // adds a component to the array
    public void addComponent(Component component){
        components.add(component);
    }
    // removes a component from the array
    public void removeComponent(Component component){
        components.remove(component);
    }

    // returns the string representation of the component
    public String toString(){
        for (Component component : components) {
            System.out.println(component);
        }
        return "Name: " + name + ", Description: " + description + ", Price: " + price;
    }
}
