import java.util.*;

class Day3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.printl(0);
            return;
        }

        int maxLen = 1;
        int count = 1;

        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i - 1]) {
                count++;
                if(count > maxLen) {
                    maxLen = count;
                }
            } else {
                count = 1;
            }
        }

        System.out.println(maxLen);
    }
}
