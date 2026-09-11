class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        boolean dp[][]=new boolean[l1+1][l2+1];
        for(int j=0;j<=l2;j++){
            dp[0][j]=true;
        }
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=dp[i][j-1];
                }
            }
        }
        return dp[l1][l2];
    }
}