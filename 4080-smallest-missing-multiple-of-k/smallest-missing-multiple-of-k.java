class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int res=0;
        for(int i=1;i<=nums.length;i++){
            res=k*i;
            if(set.contains(res)){
                continue;
            }
            else{
                return res;
            }
        }
        return res+k;
    }
}