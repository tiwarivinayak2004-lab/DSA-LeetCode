class Solution {
    public int subarraySum(int[] nums, int k) { 
        // int cnt=0;
        // int l=0,r=0;
        // int sum=0;

        // if(nums.length<=1){
        //     return k;
        // }

        // while(r<nums.length){
        //     sum+=nums[r];
        //     while(sum>k){
        //         sum-=nums[l];
        //         l++;
        //     }
        //     if(sum==k){
        //         cnt++;
        //     }
        //     r++;
        // }
        // return cnt;

        Map<Integer,Integer> map=new HashMap<>();

        map.put(0,1);
        int cnt=0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            cnt+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}