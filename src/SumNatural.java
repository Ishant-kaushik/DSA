public class SumNatural {
    static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    static int sumIterative(int n) {
        return n * (n + 1) / 2; // direct formula
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum (Recursive): " + sumRecursive(n));
        System.out.println("Sum (Formula): " + sumIterative(n));
    }
}
