import java.util.*;

public class Test {
    public static void main(String[] args) {
        // how to compare (for sorting) objects in lists/sets

        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("frog");
        animals.add("cat");
        animals.add("bird");
        animals.add("bug");
        animals.add("dinosaur");
        animals.add("snake");
        animals.add("turtle");

        Collections.sort(animals);
        System.out.println(animals); // [bird, bug, cat, dinosaur, dog, frog, snake, turtle] // natural sort

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers);
        System.out.println(numbers); // [0, 5, 100, 500]

        // Order strings by length
        Collections.sort(animals, new StringLengthComparator()); // anonymous class also applicable
        System.out.println(animals); // [bug, cat, dog, bird, frog, snake, turtle, dinosaur] // shortest word first

        // own class sorting
        List<Person> people = new ArrayList<>();
        people.add(new Person(2, "Mike"));
        people.add(new Person(1, "Yulia"));
        people.add(new Person(3, "Bob"));

        Collections.sort(people, new Comparator<Person>() { // sort by name ascending
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getName().compareTo(o2.getName());
                if (result > 0){
                    return 1;
                } else if (result < 0){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(people); // [Person{id=3, name='Bob'}, Person{id=2, name='Mike'}, Person{id=1, name='Yulia'}]
    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        // if o1 > o2 -> 1
        // if o1 < o2 -> -1
        // if o1 == o2 -> 0
        if (o1.length() > o2.length()){
            return 1;
        } else if (o1.length() < o2.length()){
            return -1;
        }
        return 0;
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}