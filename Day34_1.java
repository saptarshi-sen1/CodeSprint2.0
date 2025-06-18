import java.util.*;

public class Day34_1 {

    public static List<Integer> generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> primes = generatePrimes(n);
        List<Integer> superPrimes = new ArrayList<>();
        List<Integer> primeIndices = generatePrimes(primes.size());

        for (int i : primeIndices) {
            superPrimes.add(primes.get(i - 1));
        }

        for (int num : superPrimes) {
            if (num <= n) {
                System.out.print(num + " ");
            }
        }
    }
}