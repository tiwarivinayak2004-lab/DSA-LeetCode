class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxFreq=0;
        int result=0;

        for(int n: nums){
            int freq=map.getOrDefault(n,0)+1;
            map.put(n,freq);
            if(freq>maxFreq){
                maxFreq=freq;
                result=freq;
            }else if(freq==maxFreq){
                result+=freq;
            }
        }
        return result;
    }
}