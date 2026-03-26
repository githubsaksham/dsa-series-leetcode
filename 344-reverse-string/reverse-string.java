class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        char[] result = new char[len];
        int index =0;
        for(int i=len-1;i>=0;i--){
            result[index] = s[i];
            index++;
        }

        for(int i=0;i<len;i++){
            s[i] = result[i];
        }
        
        


        
    }
}