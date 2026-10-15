class Solution {
    public int sumCounts(List<Integer> nums) {
        int len=nums.size();
        int sq=0;
        int sum=0;
        for(int i=0;i<len;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<len;j++){
                set.add(nums.get(j));
                int setsize=set.size();
                sum+=setsize*setsize;
            }
        }
        return sum;
    }
}