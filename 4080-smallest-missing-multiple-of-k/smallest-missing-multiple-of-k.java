class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        
        for(int num:nums){
            set.add(num);
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