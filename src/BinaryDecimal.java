public class BinaryDecimal {
    static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static void main(String[] args) {
        String binary = "10101";
        int decimal = 21;

        System.out.println("Binary to Decimal: " + binary + " → " + binaryToDecimal(binary));
        System.out.println("Decimal to Binary: " + decimal + " → " + decimalToBinary(decimal));
    }
}
