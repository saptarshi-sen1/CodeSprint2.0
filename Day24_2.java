import java.util.*;

public class Day24_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();                // Read number of citizens
        int[] arr = new int[n];              // Create array of size n

        for (int i = 0; i < n; i++) {        // Read n integers
            arr[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {   // Print in reverse order
            System.out.print(arr[i] + " ");
        }
    }
}