class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer ,Integer> result = new HashMap<>();
        for(int num : nums){
            result.put(num,result.getOrDefault(num,0)+1);
            if(result.get(num) > length/2){
                return num;
            }
        }
        return -1;
    }
}