class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n==1) return;
        int i=0;
        int insert=0;

        while(i<n){
            if(nums[i]==0){
                i++;
            }
            else{
                nums[insert]=nums[i];
                i++;
                insert++;
            }
        }
        while(insert<n){
            nums[insert]=0;
            insert++;
        }
    }
}