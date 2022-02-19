//public class - main class in Java. Can be only 1
// class name should be the same as file name of .java container

//class - template, object - concrete instanse of such class
// dog - class, Scooby - object

// class can have:
// 1. Data (fields)
// 2. Actions, which it can perform (methods)



public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 44;

        person1.speak();

        Person person2 = new Person();
        person2.name = "Ivan";
        person2.age = 40;

        person2.speak();
        person2.sayHello();

    }
}

class Person{
    String name;
    int age;

    // method for introducing. void - nothing will be returned (only printed in console some text)
    void speak(){
        System.out.println("My name is " + name + ". I am " + age +" years old.");
    }

    void sayHello(){
        System.out.println("Hello");
    }

}

//Output:
//
//        My name is Roman. I am 44 years old.
//        My name is Ivan. I am 40 years old.
//        Hello