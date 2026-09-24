class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=sumDig(nums[i]);
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
    private int sumDig(int x){
        if(x>=0 && x<=9) return x;
        int sum=0;
        while(x>0){
            int a=x%10;
            sum+=a;
            x=x/10;
        }
        return sum;
    }
}