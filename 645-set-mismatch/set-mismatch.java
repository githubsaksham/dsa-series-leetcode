class Solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        HashSet<Integer> data = new HashSet<>();
        int run =1;

        int[] result = new int[2];
        for(int i=0;i<len;i++){
            if(data.contains(nums[i]))
               result[0] = nums[i];  

            data.add(nums[i]);
        }

        for(int i=1;i<=len;i++){
            if(!data.contains(i)){
                result[1] = i;
            }
        }


        return result;
        
        
    }
}