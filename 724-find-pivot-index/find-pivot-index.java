class Solution {
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        int sum=0;
        int leftsum=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        int rightsum=0;
        for(int i=0;i<len;i++){
            rightsum=sum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}