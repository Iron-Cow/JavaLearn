import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        // in basic Java realization - Double linked list (see linked list schema.png)
        // it means that each element has a link to next and previous list element

        // custom linked list (single linked)
        myLinkedList.add(1);
        myLinkedList.add(10);
        myLinkedList.add(4);

        System.out.println(myLinkedList); // [1, 10, 4]
        System.out.println(myLinkedList.get(1)); // 10
//        System.out.println(myLinkedList.get(4)); // error
//        System.out.println(myLinkedList.get(-1)); // error

//        myLinkedList.remove(3); //error invalid index
        myLinkedList.remove(1);
        System.out.println(myLinkedList); // [1, 4]


    }
}

