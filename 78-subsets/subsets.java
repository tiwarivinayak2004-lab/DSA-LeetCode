class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        fun(0,new ArrayList<>(),nums);
        return res;
    }
    public void fun(int ind,List<Integer>sublist,int[] nums)
    {
        if(ind==nums.length){
            res.add(new ArrayList(sublist));
            return;
        }
        sublist.add(nums[ind]);
        fun(ind+1,sublist,nums);
        sublist.remove(sublist.size()-1);
        fun(ind+1,sublist,nums);

    }
}