import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        Stack<String> stack = new Stack<>();
        
        // Push tokens into stack
        while (st.hasMoreTokens()) {
            stack.push(st.nextToken());
        }
        
        // Build reversed string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) { 
                result.append(" "); // add space between words
            }
        }
        
        return result.toString();
    }
}