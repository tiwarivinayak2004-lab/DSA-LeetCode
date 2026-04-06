class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxlen=0;
        int hash[]=new int[26];
        int maxf=0;
        while(r<s.length()){
            char right=s.charAt(r);
            hash[right-'A']++;
            maxf=Math.max(maxf,hash[right-'A']);
            while((r-l+1)-maxf>k){
                char left =s.charAt(l);
                hash[left -'A']--;
                maxf=0;
                for(int i=0;i<26;i++){
                    maxf=Math.max(maxf,hash[i]);
                }
                l=l+1;
            }
            if((r-l+1)-maxf<=k) maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}