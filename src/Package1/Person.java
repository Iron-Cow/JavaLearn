package Package1;

public class Person {
    public final static String CONSTANT = "CONSTANT"; // only recommended place to use public access
    public String name;
    int age;
    private double avgGrades;
    protected String lastName;

    public Person(){
        lastName = "Rot";
    }
}
