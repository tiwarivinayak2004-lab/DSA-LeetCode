class Solution {
    public int numOfWays(int n) {
        long diff=6;
        long same=6;
        long mod=(long)1e9+7;
        for(int i=2;i<=n;i++){
            long newdiff=(3*diff+2*same)%mod;
            long newsame=(2*diff+2*same)%mod;
            diff=newdiff;
            same=newsame;
        }
        return (int)(diff+same)%(int)mod;
    }
}