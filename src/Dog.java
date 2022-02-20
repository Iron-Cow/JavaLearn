public class Dog extends Animal{
    public void bark(){
        System.out.println("Bark-bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating ...");
    }
}
