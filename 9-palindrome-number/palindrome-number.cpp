class Solution {
public:
    bool isPalindrome(int x) {
        int num =x;
        long long rev =0;
       if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        while(num!=0){
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }

        if(x==rev) return true;

        return  false;
        
    }
};