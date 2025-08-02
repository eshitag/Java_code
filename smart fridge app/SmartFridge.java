import java.util.*;

public class SmartFridge{
    
    //smartfeatures: add items in a list, remove items, check expiry of items.
    ArrayList<FridgeItem> items = new ArrayList<>();
    
     public void addItem(FridgeItem item){
        items.add(item); 
        }
        
    public void readList(){
        for (FridgeItem i : items){
            System.out.println(i + " added to your smart fridge!");
        }
    }
    
    public void removeItem(String name){
        
        for(int i=0; i < items.size(); i++){
            if(items.get(i).name.equalsIgnoreCase(name)){
                items.remove(i);
                System.out.println(name + " was removed from smart fridge.");
                return;
            }
        }
             System.out.println(name + " was not found in smart fridge.");
       
    }
    public void checkExpiry(String name){
        for(int i=0; i < items.size(); i++){
            if(items.get(i).name.equalsIgnoreCase(name)){
                System.out.println(items.get(i).name + " is Expiring on " + items.get(i).expiry);
            }
        }
    }
}