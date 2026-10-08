class Solution {
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        int pre[]=new int[len];
        int suff[]=new int[len];
        pre[0]=0;
        suff[len-1]=0;
        for(int i=1;i<len;i++){
            pre[i]=pre[i-1]+nums[i-1];
        }
        for(int i=len-2;i>=0;i--){
            suff[i]=suff[i+1]+nums[i+1];
        }
        for(int i=0;i<len;i++){
            if(pre[i]==suff[i]){
                return i;
            }
        }
        return -1;
    }
}