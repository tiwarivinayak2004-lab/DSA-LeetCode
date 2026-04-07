class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res=findgoal(nums,goal)-findgoal(nums,goal-1);
        return res;
    }
    private int findgoal(int[] nums,int goal){
        if(goal<0) return 0;
        int r=0,l=0,cnt=0;
        int sum=0;
        int n=nums.length;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l+=1;
            }
            cnt+=r-l+1;;
            r++;
        }
        return cnt;
    } 
}