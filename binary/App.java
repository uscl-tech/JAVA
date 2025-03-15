import java.util.Scanner;
public class App{
    static{
        System.out.println("\n\t Binary values \n");
    }
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\t Enter the binary value  : ");
        int n =  sc.nextInt();
    
        Bits obj = new Bits();  // Creating an object of Bits
        int decimalValue = obj.dec(n);  // Calling the instance method 
        System.out.println("\n\t Decimal: " + decimalValue);
        
    }
}