import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class KthLargestTest {

    @Order(1)
        @Test
        public void testKthLargestHappyPath() {

            int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
            int k = 3;
            int expectedResult = 9;


            KthLargest tkt = new KthLargest();
            int actuallyResalt = tkt.kthLargest(array,k);


            Assertions.assertEquals(actuallyResalt, expectedResult);
        }

    @Order(2)
    @Test
    public void testKthLargestDifferNumberResalt() {

        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 6;


        KthLargest tkt = new KthLargest();
        int actuallyResalt = tkt.kthLargest(array,k);


        Assertions.assertEquals(actuallyResalt, expectedResult);
    }

    }
