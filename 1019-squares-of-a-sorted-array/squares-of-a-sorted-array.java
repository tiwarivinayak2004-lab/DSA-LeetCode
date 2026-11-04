class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int left=0,right=n-1;
        for(int i=n-1;i>=0;i--){
            int sq1=nums[left]*nums[left];
            int sq2=nums[right]*nums[right];
            if(sq1<sq2){
                res[i]=sq2;
                right--;
            }else{
                res[i]=sq1;
                left++;
            }
        }
        return res;
    }
}