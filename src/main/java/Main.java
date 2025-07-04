import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();
        BigDecimal[] values  = new BigDecimal[inputSize];
        for (int i = 0; i <inputSize; i++) {
            values[i] = scanner.nextBigDecimal();
        }
        checkValue(values);
    }

    // This method checks if each value can fit in byte, short, int or long
    public static void checkValue(BigDecimal[] values){
        for (int i = 0; i < values.length; i++) {
            int isOverFlowMaxLong = values[i].compareTo(BigDecimal.valueOf(Long.MAX_VALUE));
            int isOverFlowMinLong = values[i].compareTo(BigDecimal.valueOf(Long.MIN_VALUE));
            if (isOverFlowMaxLong == 1 || isOverFlowMinLong == -1 ){
                System.out.println(values[i] + " can't be fitted anywhere.");
                continue;
            }
            else {
                // Print that the number can be fitted
                System.out.println(values[i] + " can be fitted in:");

                // Check if it fits in byte
                if(values[i].longValue()>=Byte.MIN_VALUE&&values[i].longValue()<=Byte.MAX_VALUE)
                    System.out.println("* byte");

                // Check if it fits in short
                if (values[i].longValue()>=Short.MIN_VALUE && values[i].longValue()<=Short.MAX_VALUE)
                    System.out.println("* short");

                // Check if it fits in int
                if (values[i].longValue()>=Integer.MIN_VALUE && values[i].longValue()<=Integer.MAX_VALUE)
                    System.out.println("* int");
                // All long numbers can be stored in long
                System.out.println("* long");
            }
        }
    }
}
