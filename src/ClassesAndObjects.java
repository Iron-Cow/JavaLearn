public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Roman");
        person1.setAge(-1); //Age cannot be negative
        person1.setAge(44);
        System.out.println("person 1 is " + person1.getAge() + " years old"); //person 1 is 44 years old

        Person person2 = new Person();
        String p1_name = "Ivan";
        person1.setName(""); //Please insert name with 1+ symbols inside
        person1.setName(p1_name);
        person2.setAge(40);

        person1.calculateYearsToRetirement();
        person2.calculateYearsToRetirement();

        int year1 = person1.getYearsToRetirement();
        int year2 = person2.getYearsToRetirement();

        System.out.println("Person 1 left " + year1 + " to retirement");
        System.out.println("Person 2 left " + year2 + " to retirement");


    }
}

class Person {
    // private attribute is available only inside current class
    private String name;
    private int age;


    // setter - to change something
    public void setName(String username) {
        // we can add additional checks to getters/setters
        if (username.isEmpty()){
            System.out.println("Please insert name with 1+ symbols inside");
            return;
        }
        name = username;
    }

    // getter - to receive something
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0){
            System.out.println("Age cannot be negative");
            return;
        }
        age = userAge;
    }

    public int getAge(){
        return age;
    }
    void calculateYearsToRetirement() {
        int years = 65 - age;
        System.out.println("Years to retirement - " + years);
    }

    int getYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("My name is " + name + ". I am " + age + " years old.");
    }

    void sayHello() {
        System.out.println("Hello");
    }

}

//Output:
//
//Age cannot be negative
//person 1 is 44 years old
//Please insert name with 1+ symbols inside
//Years to retirement - 21
//Years to retirement - 25
//Person 1 left 21 to retirement
//Person 2 left 25 to retirement