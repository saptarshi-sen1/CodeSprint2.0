import java.util.*;

 

class Day19_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Stack<Integer> s = new Stack<>(), min = new Stack<>();

 

        while (n-- > 0) {

            String[] c = sc.nextLine().split(" ");

            switch (c[0]) {

                case "PUSH":

                    int x = Integer.parseInt(c[1]);

                    s.push(x);

                    if (min.isEmpty() || x <= min.peek()) min.push(x);

                    break;

                case "POP":

                    if (!s.isEmpty() && s.pop().equals(min.peek())) min.pop();

                    break;

                case "MIN":

                    System.out.println(min.isEmpty() ? "EMPTY" : min.peek());

                    break;

            }

        }

        sc.close();

    }

}