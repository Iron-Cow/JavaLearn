import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Billy"); // 2 objects with same values
        Person person2 = new Person(1, "Billy"); // we redefined hashCode and equals methods


        map.put(person1, "123");
        map.put(person1, "OTHER value");

        set.add(person1);
        set.add(person2);
        // so now it should be treated as equal objects

        System.out.println(map); // {Person{id=1, name='Billy'}=OTHER value}
        System.out.println(set); // [Person{id=1, name='Billy'}]

    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
