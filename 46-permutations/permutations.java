class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        fun(0,nums);
        return res;
    }
    private void fun(int ind,int[] nums)
    {
        if(ind==nums.length)
        {
            List<Integer> sublist=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                sublist.add(nums[i]);
            }
            res.add(new ArrayList(sublist));
            return;
        }
        for(int i=ind;i<nums.length;i++)
        {
            swap(i,ind,nums);
            fun(ind+1,nums);
            swap(i,ind,nums);
        }
    }
    private void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}