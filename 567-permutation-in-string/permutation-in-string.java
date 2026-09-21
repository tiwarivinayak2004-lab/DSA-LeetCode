class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int need[]=new int[26];
        int window[]=new int[26];

        for(char ch: s1.toCharArray()){
            need[ch-'a']++;
        }
        int windowSize=s1.length();
        for(int i=0;i<s2.length();i++){
            window[s2.charAt(i)-'a']++;

            if(i>=windowSize){
                window[s2.charAt(i-windowSize)-'a']--;
            }
            if(i>=windowSize-1 && matches(need,window)){
                return true;
            }
        }
        return false;
    }
    private boolean matches(int[] need,int[] window){
        for(int i=0;i<26;i++){
            if(need[i]!=window[i]){
                return false;
            }
        }
        return true;
    }
}