class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0,sum=0,minlen=Integer.MAX_VALUE;
        int n=nums.length;
        while(r<n){
            sum+=nums[r];
            while(sum>=target) {
                minlen=Math.min(minlen,r-l+1);
                sum-=nums[l];
                l++;
            }
            r+=1;
        }
        if(minlen==Integer.MAX_VALUE){
            return 0;
        }
        else return minlen;
    }
}