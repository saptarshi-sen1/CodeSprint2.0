import java.util.Scanner;

import java.util.Stack;

 

public class Day17_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

 

        // Read the input string

        String s = sc.nextLine();

 

        // Create a stack to hold characters

        Stack<Character> stack = new Stack<>();

 

        // Push each character of the string onto the stack

        for (char c : s.toCharArray()) {

            stack.push(c);

        }

 

        // Pop characters from the stack to reverse the string

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {

            reversed.append(stack.pop());

        }

 

        // Output the reversed string

        System.out.println(reversed.toString());

 

        scanner.close();

    }

}

