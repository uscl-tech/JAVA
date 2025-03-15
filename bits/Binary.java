
public class Binary{

    static{
            System.out.println("\n\t Converting......\n");

    }
    public void binary(int n ){
            int result=cdb(n);
            System.out.println("\n\t Sucessfully converted \n");

            System.out.print("\n\t Decimal value : "+n+"\n\t Binary value : "+result+"\n");
    }
    static{
         System.out.println("\n\t 0 1 0 1 0 1 0 \n");
    }
    public static int cdb(int n){
        int b=0;
        int p=0;

        while(n>0){
            int reminder = n % 2;
            b=b+(reminder*(int)(Math.pow(10,p)));
            p++;
            n=n/2;    // quotient 
        }
        return b;
    }
}