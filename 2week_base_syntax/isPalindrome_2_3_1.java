public class isPalindrome_2_3_1 {
    public static void main(String[] args) {
        System.out.print(isPalindrome("Madam, I'm Adam!"));
    }

    public static boolean isPalindrome(String text) {
        String str = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i=0; i<str.length(); ++i) {
            if (!(str.charAt(i) == str.charAt(str.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
