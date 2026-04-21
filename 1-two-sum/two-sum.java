class Solution {
    public int[] twoSum(int[] nums, int target) {
       int res[]=new int[2];
       res[0]=-1;
       res[1]=-1;
       HashMap<Integer,Integer> map=new HashMap<>();

       for(int i=0;i<nums.length;i++){
            int more=target-nums[i];

            if(map.containsKey(more)){
                res[0]=map.get(more);
                res[1]=i;
            }
            map.put(nums[i],i);
       }
       return res;
       
    }
}
 
