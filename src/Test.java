//  src/
//      Forest/
//          Something/
//              SomeClass.java
//          Squirrel.java
//          Tree.java
//      Test.java


import Forest.Something.SomeClass;
import Forest.Squirrel;
import Forest.Tree;

//import Forest.*  // import all from package

public class Test {
    public static void main(String[] args) {
        Tree tree1 = new Tree(); // import Forest.Tree; needed to hava access to class in other folder (package)
        Squirrel sq1 = new Squirrel();
        SomeClass sC = new SomeClass();

    }
}
