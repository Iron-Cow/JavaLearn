import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
//        LinkedHashMap - keeps order of added elements
//        TreeMap - order elements by key

        Map<Integer, String> hashMap = new HashMap<>(); // no order guaranteed
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>(); // natural ordering

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map){
        System.out.println("*********");

        map.put(39, "Bob");
        map.put(12, "Ann");
        map.put(11, "Bill");
        map.put(100, "Fred");
        map.put(49, "Lara");
        map.put(123, "Bob");

        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

//        *********
//        49 : Lara
//        100 : Fred
//        39 : Bob
//        11 : Bill
//        123 : Bob
//        12 : Ann
//        *********
//        39 : Bob
//        12 : Ann
//        11 : Bill
//        100 : Fred
//        49 : Lara
//        123 : Bob
//        *********
//        11 : Bill
//        12 : Ann
//        39 : Bob
//        49 : Lara
//        100 : Fred
//        123 : Bob