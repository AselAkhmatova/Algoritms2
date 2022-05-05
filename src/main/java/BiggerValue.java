public class BiggerValue<i> {

    public  int biggerValue (int a, int b){

        int i = 0 ;
        if (a > b){

            i = a;
        } if (b > a) {

            i = b;
        }if (a == b) {

            return a;

        }return i;
    }

}
