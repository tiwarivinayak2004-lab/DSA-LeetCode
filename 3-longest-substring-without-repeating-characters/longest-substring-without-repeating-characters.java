class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mpp=new HashMap<Character,Integer>();
        int left=0;int len=0;
        int n=s.length();
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);

            if(hash[ch]!=-1){
                left=Math.max(left,hash[ch]+1);
            }
            hash[ch]=right;
            len=Math.max(len,right-left+1);
        }
        
        return len;
    }
}