class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] freq=new int[k];
        freq[0]=1;
        int sum=0;
        int count=0;

        for(int i: nums){
            sum+=i;

            int rem=sum%k;

            if(rem<0){
                rem=rem+k;
            }

            count+=freq[rem];
            freq[rem]++;
        }
        return count;
    }
}