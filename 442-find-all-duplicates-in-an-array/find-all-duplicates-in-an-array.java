class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int id=Math.abs(nums[i])-1;
            if(nums[id]<0){
                res.add(id+1);
            }
            else{
                nums[id]=-nums[id];
            }
        }
        return res;
    }
}