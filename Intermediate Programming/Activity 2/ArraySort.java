import java.util.Scanner;

public class ArraySort {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input size of array from user then create the array
        int arraySize = getIntNumber(input, "Define the size of the array: ");
        int[] numberList = new int[arraySize];

        // Fill array with input
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = getIntNumber(input, "Input array element: ");
        }
        
        // Start comparing numbers from the first value
        for (int i = 0; i < numberList.length; i++) {
            // Set the smallest minimum value as the current value
            // If there is no smaller number then the replacing value will just be itself
            int min = numberList[i];

            // Set the current position as the value of i
            int index = i;

            // For switching variables
            int temp = numberList[i];
            
            // Start comparison starting from the first number
            for (int j = 0; j <= numberList.length - 1; j++) {
                // The comparing number should be LOWER than the current min
                // Position of the current number must also be HIGHER
                // e.g (4, 6 = 4 is smaller than 6 BUT the position is LOWER so why switch?) 
                // e.g (6, 4 = 4 is smaller than 6 AND the position is HIGHER so switch since 4 is in incorrect place)
                if (numberList[j] < min && i < j) {

                // Replace the value of min with the new lower number IF it is much lower
                    min = numberList[j];
                    index = j;
                }
            }

            // Switch values
            numberList[i] = min;
            numberList[index] = temp;
        }
        input.close();
        
        System.out.print("The sorted array is: ");
        for (int num : numberList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Forces user to enter correct value and avoids crash with other characters
    public static int getIntNumber(Scanner input, String message) {
        while (true) {
            try {
                System.out.print(message);
                return input.nextInt();
            } catch(Exception e) {
                System.out.println("Error: Number is out of bounds or incorrect.");
                input.nextLine();
            }
        }
    }
}
