class Solution {
    public void swap(int[]  arr , int low , int high){
       
        while(low<=high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

             low++;
        high--;
        }
       

    }
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k% length;
        if(length == 0 || length == 1 ) return;
        swap(nums,0,length-1);
        swap(nums,0,k-1);
        swap(nums,k,length-1);
        
        
    }
}