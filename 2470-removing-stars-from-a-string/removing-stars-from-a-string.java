class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        int len=s.length();
        if(len==0) return "";
        // st.push(s.charAt(0));
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }

        return res.reverse().toString();
    }
}