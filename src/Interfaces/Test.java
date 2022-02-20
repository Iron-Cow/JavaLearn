package Interfaces;

// we will make 2 classes behave in the same way using Interfaces
// create file in package - Interface - insert interface name

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");

        animal1.sleep();
        person1.sayHello();

//        I am sleeping
//        Hello

        // same behaviour method:
        animal1.showInfo();
        person1.showInfo();

//        Animal id is 1
//        Person name is Bob

        // ---------

        // attention to the type of variable (interface allowed)

        Info info1 = new Person("Billy");
        Info info2 = new Animal(2);
//        info1.sayHello()  // method not available now

        // ---------


        outputInfo(info1);
        outputInfo(animal1);

//        Person name is Billy
//        Animal id is 1

    }


    public static void outputInfo(Info info){
        // any object implementing Info interface is suitable
        info.showInfo();
    }
}


