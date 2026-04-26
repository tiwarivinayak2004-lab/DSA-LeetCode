class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int minpro=nums[0];
        int maxpro=nums[0];
        int result=nums[0];
        for(int i=1;i<n;i++){

            int curr=nums[i];
            int temp=maxpro;

            maxpro=Math.max(curr,Math.max(curr*maxpro,curr*minpro));
            minpro=Math.min(curr,Math.min(curr*temp,curr*minpro));

            result=Math.max(maxpro,result);
        }
        return result;
    }
}