class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int bitcnt[]=new int[32];
        long MOD=1_000_000_007L;
        for(int num:nums){
            for(int bit=0;bit<32;bit++){
                if((num & (1<<bit))!=0){
                    bitcnt[bit]++;
                }
            }
        }
        long ans=0;
        for(int i=0;i<k;i++){
            long num=0;
            for(int bit=31;bit>=0;bit--){
                if(bitcnt[bit]>0){
                    num|=(1L<<bit);
                    bitcnt[bit]--;
                }
            }
            ans=(ans+num*num)%MOD;
        }
        return (int)ans;
    }
}