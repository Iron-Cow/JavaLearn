//final - variable, that can not be changed anymore (as constant)

public class FinalKeyWord {
    public static void main(String[] args) {
        Test t1 = new Test(123);
        Test t2 = new Test(324);

        System.out.println(t1.getCONSTANT());
        System.out.println(t2.getCONSTANT());

        // 123
        // 324

        // ----
        final int x;
        x = 10;
//        x = 20;  // not allowed to change it after assigment
    }
}

class Test{
    // final can be static also (should be initialized right away (public static final int CONSTANT = 10;) )
    public final int CONSTANT;

    public Test(int CONSTANT){
        this.CONSTANT = CONSTANT;
    }

    public int getCONSTANT() {
        return CONSTANT;
    }

    // not possible to change it
//    public void setCONSTANT(int x){
//        this.CONSTANT = x;
//    }
}
