//Inheritance 

class Supernatural{
    String name;
    Supernatural(String name){
        this.name = name;
    }
    void instinct(){
        System.out.println("Kill");
    }
    
}

class Vampire extends Supernatural{
    Vampire(String name){
        super(name);
    }
    
    @Override
    void instinct(){
        System.out.println(name +  " is a Blood sucker");
    }
}



//Abstraction

abstract class Originals{
    String name;
    Originals(String name){
        this.name = name;
    }
    void accent(String name){
    }
}

class OriginalVampire extends Originals{
    OriginalVampire(String name){
        super(name);
    }
    @Override
    void accent(String name){
        System.out.println("All originals including " + name + " speak a British accent");
    }
}


public class Main{
    public static void main(String args[]){
        Vampire v1 = new Vampire("Caroline");
        v1.instinct();
        Vampire v2 = new Vampire("Vicky");
        v2.instinct();
        
        OriginalVampire og1 = new OriginalVampire("Elijah");
        
        
        og1.accent("Elijah");
    }
}