class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int right = nums.length - 1;

        while(mid <= right){
            if(nums[mid]== 0){
                int temp = nums[mid];
                nums[mid++] = nums[low];
                nums[low++] = temp;
            }else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums[right];
                nums[right--]= nums[mid];
                nums[mid] = temp; 
            }
        }
        System.out.print(nums);
        System.out.print(" ");
        
    }
}