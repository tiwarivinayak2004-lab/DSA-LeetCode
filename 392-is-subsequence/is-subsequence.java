class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        int dp[][]=new int[l2+1][l1+1];
        for(int i=1;i<=l2;i++){
            for(int j=1;j<=l1;j++){
                if(t.charAt(i-1)==s.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int skip1=dp[i-1][j];
                    int skip2=dp[i][j-1];
                    dp[i][j]=Math.max(skip1,skip2);
                }
            }
        }
        if(dp[l2][l1]==l1) return true;
        else return false;
    }
}