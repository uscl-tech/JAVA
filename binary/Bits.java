public class Bits {
    public static int dec(int n) {  // Instance method
        int p = 0; // Power index
        int d = 0; // Decimal result

        while (n > 0) {
            int ld = n % 10; // Last digit (should be 0 or 1)
            d = d + ld*(int)Math.pow(2, p); // Corrected binary-to-decimal conversion
            p++;
            n = n / 10;
        }
        return d;
    }
}
