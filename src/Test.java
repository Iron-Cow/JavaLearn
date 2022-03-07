import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));
        listOfAnimals.add(new Animal(3));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());


        test(listOfAnimals);
        test(listOfDogs); // not working without wildcard
    }

//    private static void test(List<Animal> list){
//        for(Animal animal : list) {
//            System.out.println(animal);
//        }
//    }

    private static void test(List<? extends Animal> list){ // any class of Animal or child
        for(Animal animal : list) {
            animal.eat();
        }
    }

    /*
    * Object
    * Animal
    * Dog
    * */

    // <?> - any class
    // <Animal> - only for Animal
    // <? extends Animal> - Animal or classes BELOW (see hierarchy on the top)
    // <? super Animal> - Animal or classes ABOVE

}
