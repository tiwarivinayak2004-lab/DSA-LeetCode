class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=nums[0];
        int maxSum=nums[0];

        for(int i=1;i<nums.length;i++){

            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}


// int max_so_far=Integer.MIN_VALUE;
//         int max_ending_here=0;
//         int s=0,start=0,end=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             max_ending_here+=nums[i];
//             if(max_ending_here>max_so_far)
//             {
//                 max_so_far=max_ending_here;
//                 start=s;
//                 end=i;
//             }
//             if(max_ending_here<0)
//             {
//                 max_ending_here=0;
//                 s=i+1;
//             }
//         }
//         return max_so_far;