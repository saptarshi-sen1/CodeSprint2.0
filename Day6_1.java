import java.util.*;

public class Day6_1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String[] names = new String[n];
    int count=0;

    for(int i=0;i<n;i++)
    {
      String name=sc.next();
      char first = name.charAt(0);
      if("aeiou".indexOf(first)!=-1)
      {
        boolean alreadyAdded = false;
        for(int j=0;j<count;j++)
        {
          if(names[j].equals(name))
          {
            alreadyAdded = true;
            break;
          }
        }

        if(!alreadyAdded)
        {
          names[count] = name;
          count ++;
        }
      }
    }
    System.out.println(count);
    for(int i=0;i<count;i++)
      System.out.println(names[i]);
  }
}