class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int[] points=new int[max+1];
        for(int num:nums){
            points[num]+=num;
        }
        int n=nums.length;
        int[] dp=new int[max+1];
        if(n==1) return nums[0];
        dp[0]=0;
        dp[1]=points[1];
        for(int i=2;i<=max;i++){
            int take=dp[i-2]+points[i];
            int skip=dp[i-1];
            dp[i]=Math.max(take,skip);
        }
        return dp[max];
    }
}