//Dog is also animal. Dog is wiser term as animal (subset ... )

public class Dog extends Animal{

    public void eat(){
        super.eat();
        System.out.println("OM-NOM-NOM");
    }


    // annotate the method. it should override method from parent class. longSleep name will be invalid in this case.
    // signature should also be the same.

    @Override
    public void sleep() {
        super.sleep();
        // some extra logic
        System.out.println("zzz");
    }

    public void bark(){
        System.out.println("I am barking!");
    }

    public void showName(){
        System.out.println(name);
    }
}
