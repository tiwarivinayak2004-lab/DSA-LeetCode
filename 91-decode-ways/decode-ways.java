class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int dp[]=new int[n+1];
        if(s.charAt(0)=='0') return 0;
        dp[0]=1;
        if(n==1) return 1;
        for(int i=1;i<=n;i++){
            if(s.charAt(i-1)!='0'){
                dp[i]=dp[i]+dp[i-1];
            }
            if(i>=2){
                int num1=Integer.parseInt(s.substring(i-2,i));
                if(num1 >= 10 && num1 <= 26){
                    dp[i]=dp[i]+dp[i-2];
                }
            }
        }
        return dp[n];
    }
}