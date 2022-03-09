
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}
//
//class OtherAnimal extends Animal{
//    public void eat(){
//        System.out.println("Other animal is eating...");
//    }
//}


public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

//        OtherAnimal otherAnimal = new OtherAnimal();
//        otherAnimal.eat();

        Animal otherAnimal = new Animal() { // Anonymous class (with different realization)
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };

        otherAnimal.eat();
    }
};
