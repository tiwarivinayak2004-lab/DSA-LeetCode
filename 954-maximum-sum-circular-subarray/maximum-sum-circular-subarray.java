class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int currMax=0,maxSum=nums[0];
        int currMin=0,minSum=nums[0];

        for(int n:nums){

            currMax=Math.max(currMax+n,n);
            maxSum=Math.max(maxSum,currMax);

            currMin=Math.min(currMin+n,n);
            minSum=Math.min(minSum,currMin);

            total+=n;
        }

        if(total==minSum) return maxSum;

        return Math.max(maxSum,total-minSum);
    }
}