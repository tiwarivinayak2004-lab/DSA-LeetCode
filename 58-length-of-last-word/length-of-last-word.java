import java.util.StringTokenizer;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s," ");
        Stack<String> stack=new Stack<>();
        while(st.hasMoreTokens())
        {
            stack.push(st.nextToken());
        }
        int len=stack.pop().length();
        return len;
    }
}