import java.util.*;
import java.math.BigInteger;

public class Day45_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        if (expression.charAt(0) != '-') expression = "+" + expression;
        int numerator = 0, denominator = 1;
        for (int i = 0; i < expression.length(); ) {
            char sign = expression.charAt(i);
            i++;
            int j = i;
            while (j < expression.length() && expression.charAt(j) != '+' && expression.charAt(j) != '-') j++;
            String frac = expression.substring(i, j);
            String[] parts = frac.split("/");
            int num = Integer.parseInt(parts[0]);
            int den = Integer.parseInt(parts[1]);
            if (sign == '-') num = -num;
            numerator = numerator * den + num * denominator;
            denominator *= den;
            int gcd = BigInteger.valueOf(numerator).gcd(BigInteger.valueOf(denominator)).intValue();
            numerator /= gcd;
            denominator /= gcd;
            i = j;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        System.out.println(numerator + "/" + denominator);
    }
}