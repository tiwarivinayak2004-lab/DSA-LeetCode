class Solution {
    public String removeOuterParentheses(String s) {
        int len=s.length();
        int bal=0;
        String ans="";
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(bal>0){
                    ans+=ch;
                }
                bal+=1;
            }else{
                if(bal>1){
                    ans+=ch;
                }
                bal-=1;
            }
        }
        return ans;
    }
}