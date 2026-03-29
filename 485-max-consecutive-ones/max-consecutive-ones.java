class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                cnt++;
            }
            else
            {
                cnt=0;
            }
            if(cnt>max)
        {
            max=cnt;
        }
        }
        
        return max;
    }
}