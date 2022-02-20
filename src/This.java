public class This {
    public static void main(String[] args) {

//        constructor approach:

        Human human1 = new Human(); // Hello from first constructor

        Human human2 = new Human("Bob"); // Hello from constructor 2

        Human human3 = new Human("Billy", 18); // Hello from constructor 3

//        same as:
//        Human human3 = new Human();
//        human3.setAge(18);
//        human3.setName("Billy");

    }
}

class Human {
    String name;
    int age;

    // constructor; (name should be the same as class name). If constructor not defined - empty public Human(){} called
    public Human(){
        System.out.println("Hello from first constructor");
        this.name = "Default name";
        this.age = 0;
    }

    public Human(String name){
        System.out.println("Hello from constructor 2");
        this.name = name;
        this.age = 0;
    }

//    method reload - method with same names but different entry params
    public Human(String name, int age){
        System.out.println("Hello from constructor 3");
        this.name = name;
        this.age = age;
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
}