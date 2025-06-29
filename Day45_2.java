import java.util.*;

public class Day45_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int[] output = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        
        prefix[0] = 1;
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        
        suffix[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        
        for(int i = 0; i < n; i++) {
            output[i] = prefix[i] * suffix[i];
        }
        
        for(int i = 0; i < n; i++) {
            System.out.print(output[i]);
            if(i < n - 1) System.out.print(" ");
        }
    }
}