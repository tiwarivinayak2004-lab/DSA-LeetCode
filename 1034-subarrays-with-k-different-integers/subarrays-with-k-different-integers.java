class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n=nums.length;
        int ans=func(nums,k)-func(nums,k-1);
        return ans;
    }
    private int func(int nums[],int k){
        int l=0,r=0,cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}