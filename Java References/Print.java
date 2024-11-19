public class Print {
    public static void main(String[] args) {
        // Print with new line
        System.out.println("Hello, Earth!");
        // Print without new line
        System.out.print("Hello, Universe!");
        // Manual New Line
        System.out.println("\nHello, World!"); 
        // Combining string
        String earth = "Hello, Earth!";
        String universe = "Hello, Universe!";
        System.out.println(earth + " " + universe);

        // Arithmetic operation
        System.out.println(5 % 5);
        System.out.println(5 - 5);
        System.out.println(5 / 5);
        System.out.println(5 + 5);
        System.out.println(5 * 5);
        
        // String formatting
        float price = 5.99f;
        System.out.printf("The price of the item is $%.2f.", price);
    }
}
