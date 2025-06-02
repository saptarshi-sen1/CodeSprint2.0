import java.util.*;
class Main
{
  public static int eval(String[] arr)
  {
    Stack<Integer> s = new Stack<>();
    for(String token : arr)
    {
      if("+-*/".contains(token))
      {
        int b = s.pop(), a = s.pop();
        switch(token)
        {
          case "+":
              s.push(a+b);
              break;
            
          case "-":
              s.push(a-b);
              break;
            
          case "*":
              s.push(a*b);
              break;
            
          case "/":
              s.push(a/b);
              break;
        }
      }
        else
          s.push(Integer.parseInt(token));
      }
      return s.pop();
    }

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
    
      String[] input = sc.nextLine().split(" ");
      System.out.println("Result is " + eval(input));
    }
  }