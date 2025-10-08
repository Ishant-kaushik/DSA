public class TowerofHanoi {
    static void solve(int n, char source, char aux, char dest) {
        if (n == 0) return;
        solve(n - 1, source, dest, aux);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        solve(n - 1, aux, source, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        solve(n, 'A', 'B', 'C');
    }
}
