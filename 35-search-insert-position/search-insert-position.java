class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        boolean check = false;
        boolean second = false;
        for(int i=0;i<length;i++){
            if(nums[i]==target){ 
              check = true;
              return i;
              }
        }
        if(check!= true){
            for(int i=0;i<length;i++ ){
                if(nums[i]>target){
                     second = true;
                     return i;
                     }
            }
        }

        if(second != true)
         return length;
        return -1;

        
        
    }
}