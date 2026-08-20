class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        //long totalpairs=(long)((n*(n-1))/2);
        //long goodpairs=0;
        long badpairs=0;
        HashMap<Long,Long> map=new HashMap<>();

        for(int i=0;i<n;i++){
            long value=(long)nums[i]-i;
            long goodpairs=map.getOrDefault(value,0L);
            badpairs+=i-goodpairs;
            map.put(value,goodpairs+1);
        }
        return badpairs;
    }
}