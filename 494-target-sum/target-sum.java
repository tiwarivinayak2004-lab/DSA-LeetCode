class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int tsum=0;
        for(int num:nums){
            tsum+=num;
        }
        if(Math.abs(target)>tsum) return 0;
        int rem=tsum-target;
        if(rem%2!=0) return 0;
        int subsetTarget=rem/2;
        int n=nums.length;
        int[][] dp=new int[n+1][subsetTarget+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int sum=0;sum<=subsetTarget;sum++){
                dp[i][sum]=dp[i-1][sum];
                if(nums[i-1]<=sum){
                    dp[i][sum]=dp[i][sum]+dp[i-1][sum-nums[i-1]];
                }
            }
        }
        return dp[n][subsetTarget];
    }
}