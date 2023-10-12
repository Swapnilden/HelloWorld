public class StringReversal {
    public static void main(String[] args) {
        String str = "Hello, World!"; // Change this to test different strings
        String reversed = reverseString(str);

        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
