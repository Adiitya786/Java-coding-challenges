

public class Pascal_Triangle {
   
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 0; i < n; i++) {
            // Print spaces for formatting
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int num = 1; 
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1); // formula to compute next value
            }
            System.out.println();
        }
    }
}

