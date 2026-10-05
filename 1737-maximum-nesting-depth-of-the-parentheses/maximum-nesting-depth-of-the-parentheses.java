class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth+=1;
            }
            else if(s.charAt(i)==')'){
                max=Math.max(max,depth);
                depth-=1;
            }
            else{
                continue;
            }
        }
        return max;
    }
}