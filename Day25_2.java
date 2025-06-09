import java.util.*;
public class Day25_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nums = new String[n];
        for(int i = 0; i < n; i++)
            nums[i] = sc.next();
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));
        if(nums[0].equals("0"))
            System.out.println("0");
        else {
            StringBuilder sb = new StringBuilder();
            for(String num : nums)
                sb.append(num);
            System.out.println(sb.toString());
        }
    }
}