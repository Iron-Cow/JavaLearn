// annotations can be applied to:
// P.S. Not real example

@MyAnnotation // to class
public class Test {
    @MyAnnotation // to field
    private String name;

    @MyAnnotation // to constructor
    public Test(){

    }

    @MyAnnotation // to method
    public void test(@MyAnnotation int value){ // to method param
        @MyAnnotation String localVar = "Hello"; // to local variable
    }

    @MyAnnotation // to static method
    public static void main(@MyAnnotation String[] args){

    }
}
