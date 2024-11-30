public class Print {
    public static void main(String[] args) {
        // Print with new line
        System.out.println("Hello, Earth!");
        // Print without new line
        System.out.print("Hello, Universe!");
        System.out.println();
        // Combining string
        String earth = "Earth";
        System.out.println("Hello, " + earth);

        // Escaping special characters using backslash (\)
        System.out.println("\"Hello, World!\"");
        // Manual New Line
        System.out.println("\nHello, World!"); 

        // Arithmetic operation
        System.out.println(5 % 5);
        System.out.println(5 - 5);
        System.out.println(5 / 5);
        System.out.println(5 + 5);
        System.out.println(5 * 5);
        
        // String formatting using %
        float price = 5.99f;
        System.out.printf("The price of the item is %.2f", price);
    }
}
