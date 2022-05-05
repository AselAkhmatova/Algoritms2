import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOccurencesTest {

    @Test
    public void testNumberOccurences(){

        int [] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int [][] expectedResalt = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        NumberOccurences no = new NumberOccurences();
        int [] [] actualyResalt = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};


        Assertions.assertArrayEquals(expectedResalt,actualyResalt);
    }
}
