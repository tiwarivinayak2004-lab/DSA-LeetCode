class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        
        for(int ast: asteroids){
            boolean destroyed=false;
            while(!st.isEmpty() && ast<0 && st.peek()>0){

                if(Math.abs(ast)>st.peek()){
                    st.pop();
                    continue;
                }
                if(Math.abs(ast)==st.peek()){
                    st.pop();
                }

                destroyed=true;
                break;
            }
            if(!destroyed){
                st.push(ast);
            }
        }
        int res[] =new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.peek();
            st.pop();
        }
        return res;
    }
}