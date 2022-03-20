import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Ola");
        list.add("Goodbye");


        // instead of anonymous class we will use lambda
        list.sort((s1, s2)-> {
            if (s1.length() > s2.length()){
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            }
            return 0;

        });

        // lambda can can be stored into variable

        Comparator<String> comparator = (s1, s2)-> {
            if (s1.length() > s2.length()){
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            }
            return 0;
        };

        list.sort(comparator); // and used into relevant places with same result as anonymous call

        System.out.println(list); // [Ola, Hello, Goodbye]
    }
}
