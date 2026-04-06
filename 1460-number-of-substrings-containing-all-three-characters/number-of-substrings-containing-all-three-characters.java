class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int cnt=0;
        int hash[]={-1,-1,-1};
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hash[ch-'a']=i;
            if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){
                int min=Math.min(hash[0],hash[1]);
                cnt+=1+Math.min(min,hash[2]);
            }
        }
        return cnt;
    }
}