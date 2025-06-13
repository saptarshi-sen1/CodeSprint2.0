import java.util.*;

public class Day29_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] vaccines = new int[n];
        int[] patients = new int[n];

        for (int i = 0; i < n; i++) {
            vaccines[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            patients[i] = sc.nextInt();
        }

        Arrays.sort(vaccines);
        Arrays.sort(patients);

        boolean allCured = true;
        for (int i = 0; i < n; i++) {
            if (vaccines[i] <= patients[i]) {
                allCured = false;
                break;
            }
        }

        System.out.println(allCured ? "yes" : "no");
    }
}