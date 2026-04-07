class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res=func(nums,k)-func(nums,k-1);
        return res;
    }
    private int func(int[] nums,int k){
        int r=0,l=0,sum=0,cnt=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            while(sum>k){
                sum-=nums[l]%2;
                l=l+1;
            }
            cnt=cnt+(r-l+1);
            r+=1;
        }
        return cnt;
    }
}