interface AbleToEat{
    public void eat();
}

///// anonymous class usage via interface

public class Test2 {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Some logic for eating");
            }
        };
        ableToEat.eat();
    }
}
