import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        double sum = 0, average = 0;
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter a value: ");
            myArray[i] = input.nextInt();
            sum += myArray[i];
        }
        System.out.println("The sum is: " + sum);
        average = sum / myArray.length;
        System.out.println("The average is: " + average);

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > average) {
                count++;
            }
        }
        System.out.println("The total numbers greater than average is: " + count);
    }
}
