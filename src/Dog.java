//Dog is also animal. Dog is wiser term as animal (subset ... )

public class Dog extends Animal{

    public void eat(){
        super.eat();
        System.out.println("OM-NOM-NOM");
    }

    public void bark(){
        System.out.println("I am barking!");
    }

    public void showName(){
        System.out.println(name);
//        System.out.println(secretName); // not available as private
    }
}
