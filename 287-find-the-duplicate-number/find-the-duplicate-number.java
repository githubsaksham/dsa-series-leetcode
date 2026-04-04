class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        // int result = 0 ;
        // for(int i=0;i<len;i++){
        //     for(int j=i+1;j<len;j++){
        //         if(nums[i]==nums[j]){
        //              result = nums[i];
        //              break;
        //         }
        //     }
        // }
        // return result;


        HashSet<Integer> data = new HashSet<>();

        for(int i =0;i<len;i++){
            if(data.contains(nums[i]))
                return nums[i];

            data.add(nums[i]);
        }
        return -1;
        
    }
}