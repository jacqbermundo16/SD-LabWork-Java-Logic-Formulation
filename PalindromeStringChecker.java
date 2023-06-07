public class PalindromeStringChecker {

    public static void main(String[] args) {
    
        String original = "racecar";
        String reversed = "";
        
        int strLength = original.length();
    
        for (int i = (strLength - 1); i >=0; --i) {
        reversed = reversed + original.charAt(i);
        }
    
        if (original.toLowerCase().equals(reversed.toLowerCase())) {
        System.out.println(original + " is a Palindrome String.");
        }
        else {
        System.out.println(original + " is not a Palindrome String.");
        }
    }
}
