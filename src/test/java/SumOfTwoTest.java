import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {

    @Order(1)
    @Test
    public void testSumOfTwoTest(){

        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int [][] expectedResalt = {{3, 9}, {7, 5}};

        SumOfTwo sum = new SumOfTwo();
        int [] [] actualyResalt = sum.sumOfTwo(array,n);

        Assertions.assertArrayEquals(expectedResalt,actualyResalt);


    }



}
