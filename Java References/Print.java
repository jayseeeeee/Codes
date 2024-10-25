public class Print {
    public static void main(String[] args) {
        System.out.print("Hello Universe!");
        System.out.println();
        System.out.println("Hello World!");

        // Combining string
        System.out.println("Hello World!" + " " + "Hello Universe!");

        // Arithmetic operation
        System.out.println(5 + 5);
        System.out.println(5 * 5);
        
        // String formatting
        float price = 5.99f;
        System.out.printf("The price of the item is $%.2f.", price);
    }
}
