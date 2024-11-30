import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Import scanner by initializing scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        byte age = input.nextByte();
        
        // Consumes the escape character left by nextByte()
        input.nextLine();

        System.out.print("Enter your country: ");
        String country = input.nextLine();

        System.out.println("Your name is " + name + ", currently " + age + " years old");
        System.out.println("Your country of origin is " + country);

        // Close scanner to avoid memory leak
        input.close();
    }
}