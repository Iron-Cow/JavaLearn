public class Elecrocar {
    private int id;


    // nested nonstatic class.
    private class Motor { // usually private for encapsulation
        public void startMotor(){
            System.out.println("Motor " + id + " is starting"); // we have access to instance private fields
        }
    }

    // nested static class.
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging...");
//            System.out.println(id); // no access to instance fields
        }
    }

    public Elecrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        // nested class inside the method
        class SomeClass{
            public void someMethod(){
                System.out.println("Class inside method has access to id - " + id);
            }
        }

        System.out.println("Electrocar " + id + " is starting ...");
        SomeClass someObj = new SomeClass();
        someObj.someMethod();
    }

}
