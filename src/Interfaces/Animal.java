package Interfaces;

// allowed to implement any number of interfaces, but only 1 class extension.

public class Animal implements Info /*, Info1, Inteface2 ..*/ { // now we must implement all methods stored into interface (Info)
    public int id;

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    public void showInfo(){
        System.out.println("Animal id is "+id);
    }
}
