import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        fillArr(arr1);
        fillList(list1);

        System.out.println(list1); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // each el in list/arr multiply by 2

        // loop method
//        for (int i = 0; i < 10; i++) {
//            arr[i] = arr[i] * 2;
//            list.set(i, list.get(i) * 2);
//        }

        // map
        // lambda/string method
        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).toList();


        System.out.println(list1); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
        System.out.println(Arrays.toString(arr1)); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        arr1 = Arrays.stream(arr1).map(a -> 3).toArray(); // set value to each element
        list1 = list1.stream().map(a -> 3).toList();

        System.out.println(list1); // [3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
        System.out.println(Arrays.toString(arr1)); // [3, 3, 3, 3, 3, 3, 3, 3, 3, 3]


        // filter
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        fillArr(arr2);
        fillList(list2);

        System.out.println(list2); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr2)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0 ).toArray(); // should return boolean in return
        list2 = list2.stream().filter(a -> a % 2 == 1 ).toList();

        System.out.println(list2); // [1, 3, 5, 7, 9]
        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 8, 10]


        // forEach
        Arrays.stream(arr2).forEach(a -> System.out.println(a)); // print each element of array
        list2.stream().forEach(System.out::println); // alternative way to print a


        // reduce - from list to 1 single element
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();
        fillArr(arr3);
        fillList(list3);

            // accumulator on very start (by default) - first element, then - result of previous operation
        int sumArr = Arrays.stream(arr3).reduce((accumulator, el) -> accumulator + el).getAsInt(); // sum of all elements

            // 100 - manual assignment of accumulator start value
        int sumArr2 = Arrays.stream(arr3).reduce(100, (accumulator, el) -> accumulator + el);
        int sumList = list3.stream().reduce(Integer::sum).get(); // alternative way to accumulate (sum)

        System.out.println(sumArr); // 55
        System.out.println(sumArr2); // 155
        System.out.println(sumList); // 55



        ///// Multiple operations at once
        int[] arr4 = new int[10];
        fillArr(arr4);

            // we can use multiple stream operations till we convert stream back to array
        arr4 = Arrays.stream(arr4)
                .filter(a -> a % 2 != 0) // filter even numbers
                .map(a -> a * 2).toArray(); // multiply rest by 2

        System.out.println(Arrays.toString(arr4)); // [2, 6, 10, 14, 18]

        // any collection usage
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(2);
        System.out.println(set); // [1, 2, 5]

        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(set); // [3, 6, 15]
    }
    
    public static void fillList(List<Integer> list){
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    public static void fillArr(int[] arr){
        for (int i = 0; i < 10; i++) {
            arr[i] = (i + 1);
        }
    }
}
