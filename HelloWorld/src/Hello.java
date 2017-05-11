/*****************************************
 * Created by makramibrahim on 4/16/17.
 *****************************************/
public class Hello {

    public static void main(String[] args) {

        // byte has width of 8
        byte byteValue = 10;

        //short has width of 16
        short shortValue = 20;

        // integer has width of 16
        int integerValue = 1234567891;

        // long has width of 64
        long longValue = 50000;

        long total = longValue + 10 * (byteValue + shortValue + integerValue);

        System.out.println("Total = " + total);


    }
}
