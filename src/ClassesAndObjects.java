public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 44;


        Person person2 = new Person();
        person2.name = "Ivan";
        person2.age = 40;

        person1.calculateYearsToRetirement();
        person2.calculateYearsToRetirement();

        int year1 = person1.getYearsToRetirement();
        int year2 = person2.getYearsToRetirement();

        System.out.println("Person 1 left " + year1 + " to retirement");
        System.out.println("Person 2 left " + year2 + " to retirement");


    }
}

class Person{
    String name;
    int age;

//    void - nothing will be returned (only printed in console some text)
    void calculateYearsToRetirement(){
        int years = 65 - age;
        System.out.println("Years to retirement - " + years);
    }

//    now the method will return int value, which can be used elsewhere
    int getYearsToRetirement(){
        int years = 65 - age;
        return years; // immediately exit from the method (no lines after will not be executed)
    }
    // method for introducing.

    void speak(){
        System.out.println("My name is " + name + ". I am " + age +" years old.");
    }

    void sayHello(){
        System.out.println("Hello");
    }

}

//Output:
//
//    Years to retirement - 21
//    Years to retirement - 25
//    Person 1 left 21 to retirement
//    Person 2 left 25 to retirement