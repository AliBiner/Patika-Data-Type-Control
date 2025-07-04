import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();
        String[] values  = new String[inputSize];
        for (int i = 0; i < inputSize; i++) {
            values[i] = scanner.next();
        }
        checkValue(values,0);
    }

    // This method checks if each value can fit in byte, short, int or long
    public static void checkValue(String[] values,int index){
        try {
            // If all values are checked, stop the method
            if (index >= values.length)
                return;
            else{
                // Try to convert the value to a long number
                long convertedValue = Long.parseLong(values[index]);

                // Print that the number can be fitted
                System.out.println(values[index] + " can be fitted in:");

                // Check if it fits in byte
                if (convertedValue>=Byte.MIN_VALUE && convertedValue<=Byte.MAX_VALUE)
                    System.out.println("* byte");

                // Check if it fits in short
                if (convertedValue>=Short.MIN_VALUE && convertedValue<=Short.MAX_VALUE)
                    System.out.println("* short");

                // Check if it fits in int
                if (convertedValue>=Integer.MIN_VALUE && convertedValue<=Integer.MAX_VALUE)
                    System.out.println("* int");

                // All long numbers can be stored in long
                System.out.println("* long");

                // Check the next value
                checkValue(values,++index);
            }
        }catch (NumberFormatException e){
            // If the value is too big or not a number, show this message
            System.out.println(values[index] + " can't be fitted anywhere.");
            // Check the next value
            checkValue(values,++index);
        }
    }
}
