class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       k=k%n;

       reverse(nums,0,n-1);
       reverse(nums,0,k-1);
       reverse(nums,k,n-1);
    }
    public void reverse(int[] nums,int left,int right){
        int temp=0;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}


























    //    int res[]=new int[n];
    //    int j=0;
    //    k=k%n;
    //    for(int i=n-k;i<n;i++)
    //    {
    //         res[j++]=nums[i];
    //    }
    //    for(int i=0;i<n-k;i++)
    //    {
    //     res[j++]=nums[i];
    //    }
    //    for(int i=0;i<n;i++)
    //    {
    //      nums[i]=res[i];
    //    }
