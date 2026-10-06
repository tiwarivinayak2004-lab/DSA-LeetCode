class Solution {
    public int minAddToMakeValid(String s) {
        int opencnt=0;
        int unmatched=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                opencnt+=1;
            }else{
                if(opencnt>0){
                    // unmatched-=1;
                    opencnt-=1;
                }else{
                    unmatched+=1;
                }
            }
        }
        return Math.abs(opencnt+unmatched);
    }
}