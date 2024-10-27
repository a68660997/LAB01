public class lab3q3 {
    public static void main(String[] args) {

        String[] strings = {"LEVEL", "HELLO", "RADAR", "WORLD"};

        for (String str : strings) {
            if (isPalindrome(str)) {
                System.out.println(str + " IS A PALINDROME.");
            } else {
                System.out.println(str + " IS NOT A PALINDROME.");
            }
        }                                   //2022F-BSE-290
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
}
