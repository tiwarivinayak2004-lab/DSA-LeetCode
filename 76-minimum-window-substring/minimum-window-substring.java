class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int freq[]=new int[256];
        for(char c: t.toCharArray()){
            freq[c]++;
        }

        int l=0,r=0;
        int minlen=Integer.MAX_VALUE;
        int cnt=t.length();
        int sindex=0;

        while(r<s.length()){
            if(freq[s.charAt(r)]>0){
                cnt--;
            }
            freq[s.charAt(r)]--;
            r++;
        
        while(cnt==0){
            if(r-l<minlen){
                minlen=r-l;
                sindex=l;
            }
            freq[s.charAt(l)]++;
            if(freq[s.charAt(l)]>0){
                cnt++;
            }
            l++;
        }
        }
        return minlen==Integer.MAX_VALUE? "": s.substring(sindex, sindex + minlen);
    }
}