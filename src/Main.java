import java.util.Scanner;

public class Main {
    public static int findGCD(int n, int k) {
        // Base case
        if (k == 0) {
            return n;
        }
        // Recursive case
        return findGCD(k, n % k);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();
        System.out.println(findGCD(n, k));
    }
}
