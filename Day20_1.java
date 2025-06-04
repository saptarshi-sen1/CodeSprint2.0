import java.util.*;

 

public class Day20_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();

        int count = 0;

        int start = 0;

 

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') count++;

            else count--;

 

            if (count == 0) {

                // Append inner part only

                result.append(s, start + 1, i);

                start = i + 1;

            }

        }

 

        System.out.println(result.toString());

    }

}

 