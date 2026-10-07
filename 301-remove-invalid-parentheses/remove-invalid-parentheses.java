class Solution {
    Set<String> result=new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int left=0;
        int right=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                left++;
            }
            if(ch==')'){
                if(left>0){
                    left--;
                }else{
                    right++;
                }
            }
        }
        backtrack(s,0,left,right,0,new StringBuilder());
        return new ArrayList<>(result);
    }
    private void backtrack(String s,int index,int left,int right,int balance,StringBuilder curr){
        if(index==s.length()){
            if(left==0 && right==0 && balance==0){
                result.add(curr.toString());
            }
            return;
        }
        char ch=s.charAt(index);

        if(ch=='('){
            if(left>0){
                backtrack(s,index+1,left-1,right,balance,curr);
            }
        
            curr.append(ch);
            backtrack(s,index+1,left,right,balance+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
        else if(ch==')'){
            if(right>0){
                backtrack(s,index+1,left,right-1,balance,curr);
            }
            if(balance>0){
                curr.append(ch);
                backtrack(s,index+1,left,right,balance-1,curr);
                curr.deleteCharAt(curr.length()-1);
            }
        }
        else{
            curr.append(ch);
            backtrack(s,index+1,left,right,balance,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}