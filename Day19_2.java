import java.util.*;

class Day19_2

{

  public static void main(String[] args)

  {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());

    Stack<String> stack = new Stack<>();

    Map<String, Integer> freq = new HashMap<>();

 

    while(n-- > 0)

    {

      String[] c = sc.nextLine().split(" ");

      switch(c[0])

      {

        case "PUSH":

          stack.push(c[1]);

          freq.put(c[1], freq.getOrDefault(c[1],0) + 1);

          break;

         

        case "POP":

          if(!stack.isEmpty())

          {

            String top = stack.pop();

            freq.put(top, freq.get(top) - 1);

            if(freq.get(top) == 0)

              freq.remove(top);

          }

          break;

         

          case "COUNT":

          System.out.println(stack.isEmpty() ? "EMPTY" : freq.get(stack.peek()));

          break;

      }

    }

    sc.close();

  }

}