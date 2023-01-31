package Composite;

public class Ram implements Component {
    
        // name of the component
        private String name;
        
        // description of the component
        private String description;
        
        // price of the component
        private double price;
        
        // constructor
        public Ram(String name, String description, double price){
            this.name = name;
            this.description = description;
            this.price = price;
        }
        
        // returns the price of the component
        public double getPrice(){
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
        
        // returns the string representation of the component
        public String toString(){
            return "Name: " + name + ", Description: " + description + ", Price: " + price;
        }
    
}
