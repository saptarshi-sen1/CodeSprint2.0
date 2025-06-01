import java.util.*;

 

public class Day17_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String postfix = sc.nextLine();

        sc.close();

 

        Stack<String> stack = new Stack<>();

 

        for (char ch : postfix.toCharArray()) {

            if (Character.isLetter(ch)) {

                stack.push(String.valueOf(ch));

            } else {

                String right = stack.pop();

                String left = stack.pop();

                String prefix = ch + left + right;

                stack.push(prefix);

            }

        }

 

        System.out.println(stack.pop());

    }

}