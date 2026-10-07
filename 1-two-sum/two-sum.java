class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(map.containsKey(needed)){
                res[0]=i;
                res[1]=map.get(needed);
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}