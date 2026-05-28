class Solution {
    public boolean isPalindrome(int x) {
        int y =x;
        int result = 0;
        while(y>0){
            int digit = y%10;
            result = (result*10) + digit;
            y =y/10; 

        }
        if(result==x) return true;


        return false;
        
    }
}