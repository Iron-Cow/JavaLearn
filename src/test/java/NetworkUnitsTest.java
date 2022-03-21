import org.junit.Test;

public class NetworkUnitsTest {
    @Test(timeout = 1000) // 1 second limit to run test
    public void getConnectionShouldReturnFasterThanOneSecond() {
        NetworkUtils.getConnection();
    }
}
