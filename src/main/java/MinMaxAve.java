public class MinMaxAve {


    public double [] minMaxAve(int [] array , int x , int j){

        int max = array[j];
        int min = array[x];
        int sum = 0;
        if (array.length != 0){
        for (int i = x ;i <= j; i++ ){
            sum += array[i];

            if (array[i] > max){

                max = array[i];

            }if (array[i] < min){

                min = array[i];
            }
        }
        return new double[]{min,max,sum/((j - x) +1)};
    }
    return new double[]{};

    }
}
