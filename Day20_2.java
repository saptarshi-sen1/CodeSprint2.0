import java.util.*;

class Day20_2

{

  public static void main(String[] args)

  {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(), a[] = new int[n], next[] = new int[n], res[] = new int[n];

    for(int i = 0;i<n;i++)

      a[i] = sc.nextInt();

    Arrays.fill(next, -1);

    Arrays.fill(res, -1);

    Stack<Integer> s = new Stack<>();

    for(int i=0;i<n;i++)

    {

      while(!s.isEmpty() && a[s.peek()] < a[i])

        next[s.pop()] = i;

      s.push(i);

    }

 

    for(int i=0;i<n;i++)

    {

      int ni = next[i];

      if(ni!=-1)

      {

        for(int j = ni+1;j<n;j++)

        {

          if(a[j] < a[ni])

          {

            res[i] = a[j];

            break;

          }

        }

      }

    }

 

    for(int x : res)

      System.out.print(x+ " ");

  }

}

