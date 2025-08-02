public class MyClass {
    public static void main(String args[]) {
        
        SmartFridge fridge = new SmartFridge();
        FridgeItem item1 = new FridgeItem("Milk", 1, "08-25");
        FridgeItem item2 = new FridgeItem("Butter", 4, "08-15");
        FridgeItem item3 = new FridgeItem("Jam", 1, "08-02");
        
        fridge.addItem(item1);
        fridge.addItem(item2);
        fridge.addItem(item3);
        fridge.readList();
        fridge.removeItem("jam");
        fridge.checkExpiry("Milk");
    }
}
