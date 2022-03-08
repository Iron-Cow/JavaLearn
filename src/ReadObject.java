import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        // create file people.bin in root dir (same level as src/)
        try {
            FileInputStream fis = new FileInputStream("people.bin"); // any extension
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            ois.close();

            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
