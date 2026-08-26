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
                continue;
            }
            st.push(ch);
        }
        String res="";
        if(!st.isEmpty()){
            while(!st.isEmpty()){
                char str=st.pop();
                res=str+res;
            }
        }
        else return "";

        return res;
    }
}