//All classes in java inherit Object class

public class ClassObjectDemo {
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1);             // Test@36baf30c  // default behaviour of Object.toString() method
        System.out.println(t1.toString());  // Test@36baf30c  // implicit call. Does the same job as previous line

        Test2 t2 = new Test2();
        System.out.println(t2);             // X is equal to 104  // .toString() method was redefined
    }
}

class Test{
    static int X = 102;
}

class Test2{
    static int X = 104;

    // redefine toString method (for new logic)
    public String toString(){
        return "X is equal to "+X;
    }
}