class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
    }
    private void reverse(int start,int end,int[] nums){
        int temp=0;
        int j=end;
        while(start<end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}