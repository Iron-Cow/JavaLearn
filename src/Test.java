import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        // 1 -> [... .. ...]
        // 2 -> [... .. ...]

        Map<Integer, String> map= new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Tree");

        System.out.println(map); // {1=One, 2=Two, 3=Tree}
        map.put(3, "Tres");  // override if exists
        System.out.println(map); // {1=One, 2=Two, 3=Tres}

        System.out.println(map.get(1));; // One // 1 is a key //
        System.out.println(map.get(1000)); // null

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        /*
            1 : One
            2 : Two
            3 : Tres
        */


    }
}
