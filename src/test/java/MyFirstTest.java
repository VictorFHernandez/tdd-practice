import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void test(){
        String expectedFavoriteGame = "Dark Souls";
        String  actualFavoriteGame= "Dark Souls";

        assertEquals(expectedFavoriteGame, actualFavoriteGame);
    }
}
