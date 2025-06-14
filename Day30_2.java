import java.util.*;

public class Day30_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] merlin = new int[n];
        for (int i = 0; i < n; i++) merlin[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] morgana = new int[m];
        for (int i = 0; i < m; i++) morgana[i] = sc.nextInt();

        int maxMorgana = Arrays.stream(morgana).max().getAsInt();
        int mana = 0;
        for (int i = 0; i < n; i++) {
            if (merlin[i] <= maxMorgana) {
                mana += (maxMorgana + 1 - merlin[i]);
            }
        }

        System.out.println(mana);
    }
}