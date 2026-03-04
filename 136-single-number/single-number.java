class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        if(len==1)
        {
            return nums[0];
        }
        int result=0;
        for(int i=0;i<len;i++)
        {
            result=result^nums[i];
        }
        return result;
    }
}