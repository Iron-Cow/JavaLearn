package Interfaces;

public class Person implements Info { // now we must implement all methods stored into interface (Info)
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.printf("Person name is %s\n", this.name);
    }
}
