package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    int i ;
    static boolean isOdd(int number){
        return (number % 2)!=0;
    }
    public static String getEvenNumbers(int start, int stop) {

        String result = "";
        for(int i=start; i<stop;i++){
            if(!isOdd(i))
                result = result + i;
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for(int i=start; i<stop;i++){
            if(isOdd(i)) {
                sb.append(i);
            }
        }
        return sb.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {

        return getRange(0,stop,1);
    }

    public static String getRange(int start, int stop) {

        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        for (int i=start; i<stop; i=i+step){
            sb.append (i);
        }
        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        //double e = 0;
        for(int i=start;i<stop;i+=step) {
            //e = Math.pow(i, exponent);
            result = result + (int) Math.pow(i, exponent);
        }
        return result;
    }
}
