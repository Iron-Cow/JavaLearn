import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // older version
        Iterator<Integer> iterator = list.iterator();
//        iterator.next();
//        iterator.remove();
//        iterator.hasNext();
        // iterator stores pointer to current object

        // can be replaced with for each, but we can remove elements (which is not available in for loop)
        int idx = 0;
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            if (idx == 1){
                iterator.remove(); // removing element in process of the loop
            }
            idx++;
        }

        // Java5 // now without 2nd element (we deleted it in iterator)
        for (int x : list){
            System.out.println(x);
        }



    }
}
