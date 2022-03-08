import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {
                new Person(1, "Bob"),
                new Person(2, "Mike")
        };


        // create file people.bin in root dir (same level as src/)
        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); // any extension
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length); // we need to write array length integer first

            for(Person person: people){
                oos.writeObject(person); // write each person to file
            }

//            oos.writeObject(people); // case 2 we can also write Array as an object

            fos.close(); // required for all fos
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
