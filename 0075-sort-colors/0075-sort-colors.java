class Solution {
    public void sortColors(int[] nums) {
        int left=0,n=0,right=nums.length-1;
        while(n <= right){
            if(nums[n]==0){
                int temp =nums[n];
                nums[n]=nums[left];
                nums[left]=temp;
                left++;
                n++;
            }
            else if(nums[n]==1){
                n++;
            }
            else{
                int temp =nums[n];
                nums[n]=nums[right];
                nums[right]=temp;
                right--;
            }
        }
    }
}