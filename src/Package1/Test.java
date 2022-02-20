package Package1;

public class Test { // class can be or public or default (one public per file)
    public int id;

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Name1"; // we have required access to public attribute
        person1.age = 1; // we have required access to default attribute(it stores in the same package)
//        person1.avgGrades = 1; // we have required access to private attribute(it in other class)
        System.out.println(person1.lastName); // we have required access to protected attribute (as we are in the same package)
    }

    private void technicalMethod(){
    }
}
