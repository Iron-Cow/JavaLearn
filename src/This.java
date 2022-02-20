public class This {
    public static void main(String[] args) {
        Human human1 = new Human("Billy", 18);
        human1.setName("Tom"); // instance action

        Human.description = "regular human"; // class variable (shared for all class instances)
        Human.getDescription(); // regular human

        human1.getDescription(); // regular human
        // (but IDE will show the warning - Static member 'Human.getDescription()' accessed via instance reference)

        human1.getAllFields(); // Tom, 18, regular human
        Human.printCurrentHumanPopulation(); // 1

        Human human2 = new Human("Bob", 33);
        human2.printCurrentHumanPopulation(); // 2


        ///
        Math.pow(2, 4); // another example of static method usage. Math - not instance, but class
    }
}

class Human {
    String name;
    int age;

    public static String description;
    private static int humanPopulation = 0;

    // constructor; (name should be the same as class name). If constructor not defined - empty public Human(){} called
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        humanPopulation++; // increment static variable
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }

    public void getAllFields(){
        // we can use static variables here
        System.out.println(name + ", " + age+ ", " + description);
    }

    // all above - object methods (all output and actions will be different). It uses own (this.) variables

    // static methods. can be called by class (or instance) (Human.staticMethodName())
    // and result will be the same (no own variables)

    // static method:

    public static void getDescription(){
        System.out.println(description);
    }

    public static void printAllFields(){
//        System.out.println(name); // not allowed (use this. attribute in static method)
    }

    public static void printCurrentHumanPopulation(){
        System.out.println(humanPopulation);
    }
}
