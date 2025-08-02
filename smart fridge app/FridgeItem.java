//You own a smart fridge that tracks items like milk, eggs, and fruits. 
//Each item has a name, quantity, and expiration date.

public class FridgeItem{
    
    String name;
    int quantity;
    String expiry; 
    
    FridgeItem(String name, int quantity, String expiry){
        this.name = name;
        this.quantity = quantity;
        this.expiry = expiry;
    }
    
    @Override
    public String toString(){
        return quantity + " x " + name + " (expiry: " + expiry +")";
    }
        
}