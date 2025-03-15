// Input.java
import java.util.Scanner;

public class Input {
    private int n;  // Instance variable

    // // Constructor to initialize 'n'
    // public Input(int n) {
    //     this.n = n;
    // }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t Enter a num : ");
        n = sc.nextInt();  // Store user input in instance variable 'n'
        Binary b=new Binary();

        b.binary(n);
    }

    public int getN() {  // Getter method to retrieve 'n'
        return n;
    }
}
