public class MultipIntegerM {


    public String multipIntegerM(int m){

        String z;
        if( m % 3 == 0 && m % 5 == 0){

            return z = "Good Number";

        }if (m % 3 == 0 && m % 5 != 0){

            return z = "Bad Number";
        }if (m % 5 == 0 && m % 3 != 0){

            return z = "Poor Number";
        }else{

            return z = "-1";
        }
    }

}
