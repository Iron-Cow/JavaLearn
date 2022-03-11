import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        // head -> [1] -> [2] -> [3] -> [4]
        // adding new element:
        // head -> [new_el] -> [1] -> [2] -> [3] -> [4]

        // same methods presented
        linkedList.add(1);
        linkedList.get(0);
        linkedList.size();
        linkedList.remove(0);

        List<Integer> arrayList = new ArrayList<>();
        // [1][2][3][4]
        measureAddingTime(new LinkedList<>()); // 1317
        measureAddingTime(new ArrayList<>()); // 282 // much faster


        measureReadingTime(new LinkedList<>()); // 3972
        measureReadingTime(new ArrayList<>()); // 2 // much MUCH faster

        measureHeadAddingTime(new LinkedList<>()); // 7 // now linked list MUCH faster
        measureHeadAddingTime(new ArrayList<>()); // 443

    }

    private static void fillList(List<Integer> list, int limit){
        for(int i = 0; i < limit; i++){
            list.add(i);
        }
    }

    private static void fillFromHeadList(List<Integer> list, int limit){
        for(int i = 0; i < limit; i++){
            list.add(0, i);
        }
    }

    private static void measureAddingTime(List<Integer> list){
        long start = System.currentTimeMillis();

        fillList(list, 10000000);

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void measureReadingTime(List<Integer> list){
        int limit = 100000;
        fillList(list, limit);
        long start = System.currentTimeMillis();

        for(int i = 0; i < limit; i++){
            list.get(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void measureHeadAddingTime(List<Integer> list){
        long start = System.currentTimeMillis();

        fillFromHeadList(list, 100000);

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }



}
