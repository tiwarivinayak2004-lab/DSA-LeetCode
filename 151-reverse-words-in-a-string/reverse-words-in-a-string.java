import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st=new StringTokenizer(s," ");
        Stack<String> stack=new Stack<>();

        while(st.hasMoreTokens()){
            stack.push(st.nextToken());
        }
        StringBuilder res=new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
            if(!stack.isEmpty()){
                res.append(" ");
            }
        }
        return res.toString();
    }
}