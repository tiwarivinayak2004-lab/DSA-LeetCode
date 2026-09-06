class Solution {
    public boolean canPartition(int[] nums) {
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        if(totalsum%2!=0) return false;
        int n=nums.length;
        int target=totalsum/2;
        boolean dp[][]=new boolean[n+1][target+1];
        dp[0][0]=true;
        for(int i=1;i<=n;i++){
            for(int sum=0;sum<=target;sum++){
                dp[i][sum]=dp[i-1][sum];

                if(nums[i-1]<=sum){
                    dp[i][sum]=dp[i][sum] || dp[i-1][sum-nums[i-1]];
                }
            }
        }
        return dp[n][target];
    }
}