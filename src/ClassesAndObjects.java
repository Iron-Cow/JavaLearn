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
        System.out.println("My name is " + person1.name + ". I am " + person1.age +" years old.");

        Person person2 = new Person();
        person2.name = "Ivan";
        person2.age = 40;

        System.out.println("My name is " + person2.name + ". I am " + person2.age +" years old.");
    }
}

class Person{
    String name;
    int age;
}

//Output:
//
//        My name is Roman. I am 44 years old.
//        My name is Ivan. I am 40 years old.