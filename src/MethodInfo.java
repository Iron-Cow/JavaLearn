import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // restrict usage for all except methods (no classes, variables...)
@Retention(RetentionPolicy.RUNTIME) // annotation only during runtime
public @interface MethodInfo {
    String author() default "IronCow";
    int dateOfCreation() default 2022;
    String purpose();
}
