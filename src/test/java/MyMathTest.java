import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class) // test for exception throwing
    public void zeroDenominatorShouldThrowException(){
        MyMath.divide(1, 0);
    }
}
