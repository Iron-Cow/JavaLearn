import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        // Queue - first in, first out
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new LinkedList<>();
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

        System.out.println(people); // [Person{id=3}, Person{id=2}, Person{id=4}, Person{id=1}]

        System.out.println(people.remove()); // Person{id=3} // remove and return element from head
        System.out.println(people.peek()); // Person{id=2} // return but not remove first element of queue
        // array blocking queue
        Queue<Person> peopleABQ = new ArrayBlockingQueue<Person>(3); // max capacity of the que
        System.out.println(peopleABQ.add(person3)); // true
        System.out.println(peopleABQ.add(person2)); // true
        System.out.println(peopleABQ.add(person4)); // true
//        System.out.println(peopleABQ.add(person1)); // error // Queue full
        System.out.println(peopleABQ.offer(person1)); // false // no error

        /*  ---Methods of queue---
        *                       Throw exception                 Return special value
        * Insert                    add(e)                          offer(e)
        * Remove                    remove()                        poll()
        * Examine                   element()                       peek()
        * */

    }

}
class Person{
    private int id;
    public Person(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}