//access flags: (from more restricted to less restricted)
//    private       - access into class of creation
//    default       - package level
//    protected     - package level + all subclasses (even out of default creation package)
//    public        - access open inside and outside class of creation


//    Modifier        Class       Package     Subclass        World
//    private           +            +           +              +
//    default           +            +           +              -
//    protected         +            +           -              -
//    public            +            -           -              -


import Package1.Person;

public class Test { // class can be or public or default (one public per file)
    public int id;

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Name1"; // we have required access
//        person1.age = 1; // no access to default attribute (it stores in other package, that calling class)
//        System.out.println(person1.lastName); // we have NO access to protected attribute (as we are NOT in the same package)

    }

    private void technicalMethod(){
    }
}

class Test2 extends Person{
    public Test2(){
        name = "Tom"; // now we have access to protected attribute outside the package (as we are inherited class Person)

    }
}