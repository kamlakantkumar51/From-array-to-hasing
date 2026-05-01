package Oops;

public class abst {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("eating...");
    }
    abstract void walk();
}

class Horse extends Animal{
    void changeColor(){
        color = "black";
    }
    void walk(){
        System.out.println("waling on 4 legs");
    }
}

class chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walking on 2 legs");
    }
}
