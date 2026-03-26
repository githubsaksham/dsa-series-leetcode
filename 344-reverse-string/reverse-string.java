class Solution {
    public void reverseString(char[] s) {
        int high = s.length-1;
        // char[] result = new char[len];
        // int index =0;
        // for(int i=len-1;i>=0;i--){
        //     result[index] = s[i];
        //     index++;
        // }

        // for(int i=0;i<len;i++){
        //     s[i] = result[i];
        // }
        int low=0;
        while(low<=high){
            char  temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            low++;
            high--;
            
        }



        


        
    }
}