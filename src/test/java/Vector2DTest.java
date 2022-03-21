import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    // add constants as final to avoid magic numbers
    private final double EPS = 1e-9;

    //----- move vector creation to helping method
    private static Vector2D v1;

    @Before // run before each @Test method
    public void createNewVector(){
        v1 = new Vector2D();
    }

    // OR

    @BeforeClass // run once on class creation
    public static void createNewVectorOnce(){
        v1 = new Vector2D();
    }
    //-----

    @Test
    public void newVectorShouldHaveZeroLength(){
        Assert.assertEquals(0, v1.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroXY(){
        // multiple asserts can be stored in one test case
        Assert.assertEquals(0, v1.getX(), EPS);
        Assert.assertEquals(0, v1.getY(), EPS);
    }


}

