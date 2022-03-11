import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size; // 0 by default

    public void add(int value){
        if (head == null) { // if it is the first add to list
            this.head = new Node(value);
        }else{
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            // temp is the last now

            temp.setNext(new Node(value));
        }
        size++;
    }

    public String toString(){
        int[] result = new int[size];

        int idx = 0;
        Node temp = head;
        while (temp != null){
            // idx++ - use idx (0 in first case), and THEN increase by 1 (++)
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    public int get(int index){
        int currentIndex = 0;
        Node temp = head;

        while (temp != null){
            if (currentIndex == index){
                return temp.getValue();
            }
            temp = temp.getNext();
            currentIndex++;
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index){
        // deleting 2nd el
        // [1] -> [2] -> [3] // set next for 1 to 3
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Invalid index");
        }

        if (index == 0){ // special case //
            head = head.getNext();
            size--;
            return;
        }

        int currentIndex = 0;
        Node temp = head;



        while (temp != null){
            if (currentIndex == index - 1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }else{
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    private static class Node {
        public int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
