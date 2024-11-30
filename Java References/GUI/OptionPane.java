import javax.swing.JOptionPane;

public class OptionPane {
    public static void main(String[] args) {
        // Input name through prompt dialog
        String name = JOptionPane.showInputDialog("What is your name?");
        
        // Input age through prompt dialog then convert into byte
        byte age = Byte.parseByte(JOptionPane.showInputDialog("What is your current age?"));
        
        // Display string through message dialog
        JOptionPane.showMessageDialog(null, "Welcome, " + name + "! You are currently " + age + " year(s) old.");
    }
}
