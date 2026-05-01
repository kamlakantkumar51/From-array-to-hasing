package Oops;
class INHERITANCE {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.swim();
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eating...");
    }
    void breathe(){
        System.out.println("breathing....");
    }

}

class Mamals extends Animal{
    void walks(){
        System.out.println("walking...");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swimming...");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flying...");
    }
}

// class Dog extends Mamals{
//     String breed;
// }
// //derived class or sub-class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swimming..");
//     }

// }
