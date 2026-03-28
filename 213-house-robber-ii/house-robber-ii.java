class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);

        int case1=robber(nums,0,n-2);
        int case2=robber(nums,1,n-1);

        return Math.max(case1,case2);
    }
    private int robber(int[] nums,int start,int end){

        int prev1=0;
        int prev2=0;

        for(int i=start;i<=end;i++){
            int take=nums[i]+prev2;
            int skip=prev1;

            int curr=Math.max(take,skip);

            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}