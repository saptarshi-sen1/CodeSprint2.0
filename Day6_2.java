import java.util.Scanner;

public class Day6_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String jewels = sc.next();
    String stones = sc.next();
    int count = 0;

    for (int i = 0; i < stones.length(); i++) {
      char stone = stones.charAt(i);
      if (jewels.indexOf(stone) != -1) {
        count++;
      }
    }

    System.out.println(count);
  }
}
