import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OddEvenTest {

 @Order(1)
  @Test
    public void  testAscendingSequenceHappyPastEvenNumber(){

        // 2 - Even
        long n = 0;
        String expectedResalt = "Even";

        OddEven as = new OddEven();
        String actualResalt = as.ascendingSequence(n);

     Assertions.assertEquals(expectedResalt,actualResalt);
 }

    @Order(2)
    @Test
    public void  testAscendingSequenceHappyPastEvenTwoNumber(){

        // 222222 - Even
        long n = 222222;
        String expectedResalt = "Even";

        OddEven as = new OddEven();
        String actualResalt = as.ascendingSequence(n);

        Assertions.assertEquals(expectedResalt,actualResalt);
    }



    @Order(3)
    @Test
    public void  testAscendingSequenceHappyPastOddNumber(){

        // 5 - Odd
        long n = -345;
        String expectedResalt = "Odd";

        OddEven as = new OddEven();
        String actualResalt = as.ascendingSequence(n);

        Assertions.assertEquals(expectedResalt,actualResalt);
    }

    @Order(4)
    @Test
    public void  testAscendingSequenceHappyPastUnderfinedNumber(){

        // 2147483647 + 1
        // - Underfined
        int n = 2147483647 + 1;
        String expectedResalt = "Undefined";

        OddEven as = new OddEven();
        String actualResalt = as.ascendingSequence(n);

        Assertions.assertEquals(expectedResalt,actualResalt);
    }

    @Order(6)
    @Test
    public void  testAscendingSequenceNegativNumberEven(){

        // 5 != Even
        long n = 5;
        String expectedResalt = "Even";

        OddEven as = new OddEven();
        String actualResalt = as.ascendingSequence(n);

        Assertions.assertEquals(expectedResalt,actualResalt);
    }

    @Order(7)
    @Test
    public void  testAscendingSequenceNegativOddNumber(){

        // 8 != Odd
        long n = 8;
        String expectedResalt = "Odd";

        OddEven as = new OddEven();
        String actualResalt = as.ascendingSequence(n);

        Assertions.assertEquals(expectedResalt,actualResalt);
    }

    @Order(8)
    @Test
    public void  testAscendingSequenceMaxInteger(){

        long n = Integer.MAX_VALUE;
        String expectedResalt = "Odd";

        OddEven as = new OddEven();
        String actualResalt = as.ascendingSequence(n);

        Assertions.assertEquals(expectedResalt,actualResalt);
    }
}

