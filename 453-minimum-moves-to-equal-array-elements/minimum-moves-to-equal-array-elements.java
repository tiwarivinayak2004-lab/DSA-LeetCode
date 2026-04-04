class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            min=Math.min(nums[i],min);
            sum+=nums[i];
        }
        return sum-(min*n);
    }
}