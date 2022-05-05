public class ArreNumbersEqual {


    public int arreNumbersEqual (int i, int j){

        int a = 0;

        if(i == j){

            a = 0;
        }if (i < j){

            a = -1;
        }if (i > j){

            a = 1;
        }

        return a;
    }
}
