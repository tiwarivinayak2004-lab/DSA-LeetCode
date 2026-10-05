class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int cnt=0;
        int max=0;
        st.push(0);
        for(char ch: s.toCharArray()){
            if(ch=='('){
                st.push(0);
            }else{       
                int v=st.pop();
                max=Math.max(v*2,1);
                int outer=max+st.pop();
                st.push(outer);
            }
        }
        return st.pop();
    }
}