import java.util.Scanner;

public class Main {
     /**
     * Finds the greatest common divisor (GCD) of two integers using Euclidean algorithm.
     *
     * @param n First integer
     * @param k Second integer
     * @return GCD of n and k
     */
    public static int findGCD(int n, int k) {
         // Base case: If the second integer (k) is zero, the GCD is the first integer (n)
        if (k == 0) {
            return n;
        }
        // Recursive case: Recursively call the findGCD method with the remainder of dividing n by k
        return findGCD(k, n % k);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();
        System.out.println(findGCD(n, k));
    }
}
