public class PalindromeorNot {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as input");
            return;
        }
    
        String input = args[0];
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
    
    private static boolean isPalindrome(String str) {
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