class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] conArray = new int[2*n];

        int j=0;
        for(int i=0; i<conArray.length; i++){
            conArray[i] = nums[j++];
            if(j>=n){
                j=0;
            }

        }

         return conArray;
    }
}