import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");


        // create file people.bin in root dir (same level as src/)
        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); // any extension
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close(); // required for all fos
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
