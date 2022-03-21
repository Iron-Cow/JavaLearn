import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) /* throws ClassNotFoundException */ {
        Class personClass = Person.class;
//        Class personClass = new Person().getClass(); // same result
//        Class personClass = Class.forName("Person"); // same result


        /////// get methods
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(
                   method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes())
            );

// response -> method_name, return type, input params types
//            getName, class java.lang.String, []
//            setName, void, [class java.lang.String]
//            getId, int, []
//            setId, void, [int]
//            sayHello, void, []
//            wait, void, [long, int]
//            wait, void, []
//            wait, void, [long]
//            equals, boolean, [class java.lang.Object]
//            toString, class java.lang.String, []
//            hashCode, int, []
//            getClass, class java.lang.Class, []
//            notify, void, []
//            notifyAll, void, []

        }

        /////// get fields
        Field[] fields = personClass.getFields();
        for (Field field : fields){
            System.out.println(
                    field.getName() + ", " + field.getType()
            );

            // nothing printed, due to private fields
        }


        Field[] fieldsIncludePrivate = personClass.getDeclaredFields();
        for (Field field : fieldsIncludePrivate){
            System.out.println(
                    field.getName() + ", " + field.getType()
            );

//            id, int
//            name, class java.lang.String
        }

        /////// get annotations
        Annotation[] annotations = personClass.getAnnotations();
        for(Annotation annotation : annotations){
            if (annotation instanceof Author){
                System.out.println("Yes");
                System.out.println(annotation);
            }

//            Yes
//            @Author(name="IronCow", dateOfCreation=2022)
        }





    }
}
