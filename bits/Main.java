// Main.java
public class Main {
    static {
        System.out.print("\n\t binary 0 1 \n");
    }

    public static void main(String args[]) {
        // Input i = new Input(5);  // Create an Input object with value 5
        Input i = new Input();
        i.input();  // Call input() method to take user input
        System.out.println("\n\t Stored value: " + i.getN());  // Print the stored value
       

    }
}
