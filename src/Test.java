import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        int[] list = new int[3];
//        for(int i = 0; i < 4; i++){
//            list[i] = i*10; // error // Index 3 out of bounds for length 3
//        }

        // Integer (not int) - only classes allowed. no primitives
//        ArrayList<Integer> list = new ArrayList<>();


        List<Integer> list = new ArrayList<>();
        // Due to convention we should add main collection class (see collections.png, orange classes)
        // It will help us with converting between (List here) child classes
        // f.e. list = new LinkedList<>();

        // now we can add different number of array elements

        ////// add
        for(int i = 0; i < 10; i++){
            list.add(i*10 + 10);
        }

        System.out.println(list); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]


        ////// get
        System.out.println(list.get(0)); // 10
        System.out.println(list.get(list.size() - 1)); // 100  // last element


        /////// list iterating
            // for loop
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)); // print each element of the list
        }

            // foreach
        for(Integer el: list)
            System.out.println(el); // print each element of the list

            // lambda

            // ...

        /////// remove element // not effective :(  O(n)

        list.remove(4); // removed element with index 4
        System.out.println(list); // [10, 20, 30, 40, 60, 70, 80, 90, 100]

    }






}
