public class Variable {
    public static void main(String[] args) {
        // Initializing data type
        int myNum;
        // Assigning number
        myNum = 5; 
        System.out.println(myNum);

        // Declare variable as constant or read-only
        final int myFinalNum = 5;
        System.out.println(myFinalNum);

        // Multiple initialization and decleration of variables
        int x, y, z;
        x = y = z = 5;
        System.out.println(x + y + z);
    }
}