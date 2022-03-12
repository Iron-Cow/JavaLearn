import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // Sets - only unique elements inside

        Set<String> hashSet = new HashSet<>(); // only unique inside
        Set<String> linkedHashSet = new LinkedHashSet<>(); // + order of adding remains
        Set<String> treeSet = new TreeSet<>(); // + natural ordering of elements

        System.out.println("----Testing different sets----");
        testSet(hashSet, "hashSet");
        testSet(linkedHashSet, "linkedHashSet");
        testSet(treeSet, "treeSet");

        System.out.println("----Testing set operations----");
        testSetOperations();

    }
    public static void testSetOperations(){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);


        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        System.out.println("\tUnion:");
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union); // [0, 1, 2, 3, 4, 5, 6, 7, 8]

        System.out.println("\tIntersection:");
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection); // [4, 5, 6]

        System.out.println("\tDifference:");
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("set1 - set2: " + difference); // [0, 1, 2, 3]

        Set<Integer> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("set2 - set1: " + difference2); // [7, 8]

        System.out.println("\tExclusive:");
        difference.addAll(difference2);
        Set<Integer> exclusive = difference;
        System.out.println(exclusive); // [0, 1, 2, 3, 7, 8]


    }
    public static void testSet(Set<String> set, String setName){
        System.out.println("*********");
        System.out.println(setName);
        System.out.println("*********");

        set.add("Donald");
        set.add("Bill");
        set.add("Bob");
        set.add("Jimbo");
        set.add("Bill"); // duplicate (no effect to linked hashset ordering)
        set.add("Ann");
        System.out.println("\tPrint all elements:");
        for (String name: set){
            System.out.println(name);
        }

        System.out.println("\tContains Bob:");
        System.out.println(set.contains("Bob"));
        System.out.println("\tContains Clara:");
        System.out.println(set.contains("Clara"));
    }
}
//
//----Testing different sets----
//        *********
//        hashSet
//        *********
//        Print all elements:
//        Ann
//        Bob
//        Bill
//        Donald
//        Jimbo
//        Contains Bob:
//        true
//        Contains Clara:
//        false
//        *********
//        linkedHashSet
//        *********
//        Print all elements:
//        Donald
//        Bill
//        Bob
//        Jimbo
//        Ann
//        Contains Bob:
//        true
//        Contains Clara:
//        false
//        *********
//        treeSet
//        *********
//        Print all elements:
//        Ann
//        Bill
//        Bob
//        Donald
//        Jimbo
//        Contains Bob:
//        true
//        Contains Clara:
//        false
//        ----Testing set operations----
//        Set1: [0, 1, 2, 3, 4, 5, 6]
//        Set2: [4, 5, 6, 7, 8]
//        Union:
//        [0, 1, 2, 3, 4, 5, 6, 7, 8]
//        Intersection:
//        [4, 5, 6]
//        Difference:
//        set1 - set2: [0, 1, 2, 3]
//        set2 - set1: [7, 8]
//        ExclusiveOr:
//        [0, 1, 2, 3, 7, 8]