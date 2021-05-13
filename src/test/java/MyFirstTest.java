import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void assertEqualsTest(){
        String expectedFavoriteGame = "Dark Souls";
        String  actualFavoriteGame= "Dark Souls";

        assertEquals(expectedFavoriteGame, actualFavoriteGame);
    }
    @Test
    public void assertNotSameTest(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }
}
