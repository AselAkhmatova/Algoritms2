import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SortArrayTest {

    @Order(1)
    @Test
    public void testSortArrayHapyyPath(){

        int [] array6 = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int [] expectedResalt = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sat = new SortArray();
        int [] actualyResalt = sat.sortArray(array6);

        Assertions.assertArrayEquals(expectedResalt,actualyResalt);
    }

    @Order(2)
    @Test
    public void testSortArrayDiferLightArray(){

        int [] array6 = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int [] expectedResalt = {2, 3, 4, 4, 5, 7, 9, 12};

        SortArray sat = new SortArray();
        int [] actualyResalt = sat.sortArray(array6);

        Assertions.assertArrayEquals(expectedResalt,actualyResalt);
    }

    @Order(2)
    @Test
    public void testSortArrayEmphyArray(){

        int [] array6 = {};
        int [] expectedResalt = {2};

        SortArray sat = new SortArray();
        int [] actualyResalt = sat.sortArray(array6);

        Assertions.assertArrayEquals(expectedResalt,actualyResalt);
    }
}
