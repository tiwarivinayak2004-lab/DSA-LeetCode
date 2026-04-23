class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
            int sum=nums[i]+nums[l]+nums[r];

            if(Math.abs(sum-target)<Math.abs(close-target)){
                close=sum;
            }

            if(sum<target) l++;
            else if(sum>target) r--;
            else return sum;
            }
        }
        return close;
    }
}






















// Arrays.sort(nums);
//         int closest=nums[0]+nums[1]+nums[2];
//         for(int i=0;i<nums.length-2;i++){
//             int left=i+1;
//             int right=nums.length-1;
//             while(left<right){
//                 int sum=nums[i]+nums[left]+nums[right];

//                 if(Math.abs(sum-target)<Math.abs(closest-target))
//                 closest=sum;

//                 if(sum<target) left++;
//                 else if(sum>target) right--;
//                 else return sum;
//             }
//         }
//         return closest;