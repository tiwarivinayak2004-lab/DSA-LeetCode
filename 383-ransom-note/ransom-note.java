class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[256];
        for(char ch: magazine.toCharArray()){
            freq[ch-'0']++;
        }
        for(char ch: ransomNote.toCharArray()){
            freq[ch-'0']--;
        }
        for(int i:freq){
            if(i<0){
                return false;
            }
        }
        return true;
    }
}