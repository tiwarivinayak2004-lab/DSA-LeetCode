class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxpro=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int pro=1;
            for(int j=i;j<n;j++){
                pro=pro*nums[j];
                if(pro>maxpro){
                    maxpro=pro;
                }
            }
        }
        return maxpro;
    }
}