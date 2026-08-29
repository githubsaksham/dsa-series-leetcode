class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder str = new StringBuilder();
        
        // Only letters and numbers add karo
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        
        // Palindrome check
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