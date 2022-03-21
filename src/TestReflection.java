import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        // Class_name_1 Class_name_2 Method_name
        Class classObject1 = Class.forName(scanner.next()); // Person
        Class classObject2 = Class.forName(scanner.next()); // java.lang.String
        String methodName = scanner.next(); // setName

        Method m = classObject1.getMethod(methodName, classObject2);

        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String argument value!!!");

        m.invoke(o1, o2);
        System.out.println(o1);

    }
}

//    Person java.lang.String setName
//    Person{id=-1, name='String argument value!!!'}



// java.lang.Thread java.lang.String setName
// Thread[String argument value!!!,5,main]