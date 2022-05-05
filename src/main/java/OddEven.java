public class OddEven {

    public  String ascendingSequence (long n){

    String str = null;
    if(n < Integer.MAX_VALUE && n > Integer.MIN_VALUE) {

        if (n % 2 != 0) {

            str = "Odd";

        }
        if (n % 2 == 0) {

            str = "Even";}

       } else {

            str = "Undefined";
        }

       return str;
}

}
