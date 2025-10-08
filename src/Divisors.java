public class Divisors {
    static void findDivisors(int n) {
        System.out.print("Divisors of " + n + ": ");

        // First loop prints smaller divisors
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        // Second loop prints the larger divisors (in correct ascending order)
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                System.out.print((n / i) + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 36;
        findDivisors(n);
    }
}
