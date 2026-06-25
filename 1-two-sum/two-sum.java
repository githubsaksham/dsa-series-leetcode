class Solution {
    public int[] twoSum(int[] arr, int target) {
        int length = arr.length;
        int[] result = new int[2];
        for(int i =0;i<length;i++){
            int findrest = target-arr[i];
            for(int j=i+1;j<length;j++){
                if(arr[j]==findrest){
                     result[0]=i;
                     result[1]=j;    }  
            }
        }
        return result;
        
    }
}