public class InheritanceLesson {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

//        I am eating
//        I am sleeping

        Dog dog = new Dog();

        dog.eat();      // inherited method from Animal AND REWRITTEN to own logic
        dog.sleep();    // inherited method from Animal
        dog.bark();     // Dog('s) own method
        dog.showName(); // inherited attribute from Animal

//        I am eating
//        OM-NOM-NOM
//        I am sleeping
//        I am barking!
//        some animal
    }
}
