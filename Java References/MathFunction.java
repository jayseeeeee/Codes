public class MathFunction {
    public static void main(String[] args) {
        // Math.PI - Returns long value of Pi (3.14)
        double radius = 5;
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of a circle is: " + circumference);

        // Math.round - Round off numbers
        int roundOff = (int) Math.round(circumference);
        System.out.println("The rounded value of the circumference is: " + roundOff);

        int a = 5, b = 10;
        // Math.min - Returns the smallest value of two given number
        int minimum = Math.min(a, b);
        System.out.println("The smallest number between " + a + " and " + b + " is: " + minimum);

        // Math.max - Returns the biggest value of two given number
        int maximum = Math.max(a, b);
        System.out.println("The biggest number between " + a + " and " + b + " is: " + maximum); 

        // Math.pow -
        double base = 4, power = 2;
        double powerValue = Math.pow(base, power);
        System.out.println("The value of " + base + " raised to " + power + " is: " + powerValue);
    }
}
