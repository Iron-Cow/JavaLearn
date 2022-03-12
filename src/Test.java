import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        System.out.println(peopleList);
        System.out.println(peopleSet);

    }

    private static void addElements(Collection<Person> collection) {
        collection.add(new Person(4, "Bob"));
        collection.add(new Person(2, "Alice"));
        collection.add(new Person(1, "Tim"));
        collection.add(new Person(3, "Jim"));
    }
}


class Person implements Comparable<Person> { // able to be sorted
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) { // sort by name
        int result = this.getName().compareTo(o.getName());
        if (result > 0){
            return 1;
        } else if (result < 0){
            return -1;
        }
        return 0;
    }
}