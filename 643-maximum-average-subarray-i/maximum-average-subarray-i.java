class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int n=nums.length;
        double avg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        avg=sum/k;
        double maxavg=avg;

        for(int i=k;i<n;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            avg=sum/k;
            maxavg=Math.max(avg,maxavg);
        }
        return maxavg;
    }
}