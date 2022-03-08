import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -3982538843988778425L;

    // generate after any changes in the class to keep serializable objects compatible


    private /*transient*/ int id;  // primitive transient fields will be converted to 0
    private /*transient*/ String name; // test transient field (will not be serialized) / null will be displayed

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
