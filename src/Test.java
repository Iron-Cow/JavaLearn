public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Dog dog = new Dog();
//        animal.eat();
//        dog.eat(); // also available
//        dog.bark(); // available only for dogs

//        Animal is eating ...
//        Animal is eating ...
//        Dog is barking ...


        // Upcasting - (implicit) dog is more complicated (or precise) than animal
        Animal animal = new Dog();
        animal.eat();
//        animal.bark(); // not available. We treat dog as an animal

//            // same here
//            Dog dog = new Dog();
//            Animal animal_dog = dog;

        // Downcasting - explicit only Animal becomes dog
        Dog dog1 = new Dog();
        Animal animal_dog = dog1;
//        Dog dog2 = animal_dog; // error
        Dog dog2 = (Dog)animal_dog;
        dog2.eat();



        ///// Example of dangerous downcasting
        Animal a = new Animal();
        Dog d = (Dog) a; // transformation (explicit type declarations) does not change the object
        // a - still Animal, not Dog
        d.bark(); // !!!!!!error


    }
}
