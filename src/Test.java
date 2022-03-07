import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Generics - starting from java 5+

        // old version /// java 4-
        List animals = new ArrayList(); // memory limited by device memory (not like Array case)
        animals.add("cat"); // 0
        animals.add("dog"); // 1
        animals.add("frog"); // 2

//        String animal = animals.get(1); // error // String expected Object pasted
        String animal = (String) animals.get(1); // ok

        System.out.println(animal); // dog

        // actual version java 5+ // generic

        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat"); // 0
        animals2.add("dog"); // 1
        animals2.add("frog"); // 2

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        ////// java 7+
        List<String> animals3 = new ArrayList<>(); // no type needed on the right side
        animals3.add("cat"); // 0
        animals3.add("dog"); // 1
        animals3.add("frog"); // 2

        String animal3 = animals3.get(1);
        System.out.println(animal3);

    }
}
