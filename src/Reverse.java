public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.print("Original: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.print("Reversed: ");
        for (int x : arr) System.out.print(x + " ");
    }
}
