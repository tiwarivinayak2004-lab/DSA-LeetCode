class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            if(ch1=='(' || ch1=='{' || ch1=='[')
            {
                st.push(ch1);
            }
            else
            {
                if(st.isEmpty()) return false;
                char ch=st.pop();
                if(ch=='(' && ch1!=')' || ch=='{' && ch1!='}' || ch=='[' && ch1!=']')
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}