import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        // compare objects in Java

            // primitives
        int x = 1;
        int y = 1;
        System.out.println(x == y); // true

            // objects
        AnimalSimple animalS1 = new AnimalSimple();
        AnimalSimple animalS2 = new AnimalSimple();

        System.out.println(animalS1 == animalS2); // false

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        // BEFORE adding equals() method to Animal
        System.out.println(animal1); // Animal@7a81197d
        System.out.println(animal2); // Animal@5ca881b5
        System.out.println(animal1.equals(animal2)); // false

        // AFTER adding equals() method to Animal
        System.out.println(animal1.equals(animal2)); // true
        System.out.println(animal1 == animal2); // false  // link compare (a1 IS? a2)
        Animal animal3 = animal1;
        System.out.println(animal1 == animal3); // true  // link to same object

        ///


        String s1 = "adsfasdf";
        String s2 = "adsfasdf";
        String s3 = new String("adsfasdf"); // no string pool (new ...)


        // to check equality we need to use equals(), but == will be ok due to !STRING POOL!
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s1); // true
        System.out.println(s1 == s3); // false


        // case when == does not work

        String a = "hello";
        String b = "hello123".substring(0, 5); // "hello"
        System.out.println(a.equals(b)); // true
        System.out.println(a == b); // false


    }
}

class AnimalSimple{
    private int id;
}

class Animal{
    private int id;

    public Animal(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        Animal obj = (Animal) o;
        return this.id == obj.id;
    }
}