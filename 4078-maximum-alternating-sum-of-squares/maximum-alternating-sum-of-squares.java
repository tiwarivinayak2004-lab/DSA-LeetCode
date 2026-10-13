class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] sq=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            sq[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(sq);
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length/2){
                sum-=sq[i];
            }
            else{
                sum+=sq[i];
            }
        }
        return sum;
    }
}