import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        // create file people.bin in root dir (same level as src/)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
            // refactored/ no need to close now (try with resources)
            int personCount = ois.readInt();
            Person[] people = new Person[personCount];
//            Person[] people = (Person[]) ois.readObject(); // case 2 read Array as an object ...
            for (int i = 0; i < personCount; i++){
                people[i] = (Person) ois.readObject();
            }
            System.out.println(Arrays.toString(people));
            for (Person p: people){
                System.out.println(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
