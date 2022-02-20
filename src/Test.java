//In programming language theory and type theory, polymorphism is the provision of a single interface to entities
//        of different types or the use of a single symbol to represent multiple different types
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog1 = new Dog();  // threat dog like a dog (not average animal)

        animal.eat();
        dog1.eat();
        dog1.bark();  // method available

        // -----------

        Animal dog2 = new Dog(); // threat dog like an animal same as Bird or Cat or other animal
        // all dogs are animals // so dogs can use all methods from Animal
        dog2.eat(); // Dog is eating ...  // override method will give us the latest version of behaviour
//        dog.bark();  // method not available (not defined inside Animal)

        // -----------

        Animal animal3 = new Animal();
        Dog dog3 = new Dog();  // threat dog like a dog (not average animal)
        Cat cat3 = new Cat();  // threat dog like a dog (not average animal)

        test(animal3);
        test(dog3);
        test(cat3);

//        method test/eat behaves differently, depends on calling class

//        Animal is eating ...
//        Dog is eating ...
//        Animal is eating ...

    }

    public static void test(Animal animal){
        animal.eat();
    }
}
