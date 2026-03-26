class Solution {
    public int countSymmetricIntegers(int low, int high) {
        if(high<9) return 0;
        int ans=0;

        for(int i=low;i<=high;i++){
            int j=i;
            int rev=0;
            int sum1=0;
            int sum2=0;
            int temp1=0;
            int cntdig=cntdigits(i);
            if(cntdig%2!=0) continue;
            temp1=j%(int)(Math.pow(10,(cntdig/2)));
            j=j/(int)(Math.pow(10,(cntdig/2)));
            while(j>0){
                int digit=j%10;
                sum1+=digit;
                j=j/10;
            }
            while(temp1>0){
                int digit=temp1%10;
                sum2+=digit;
                temp1=temp1/10;
            }
            if(sum1==sum2) ans++;
        }
        return ans;
    }
    public int cntdigits(int x){
        int cnt=0;
        while(x>0){
            cnt++;
            x=x/10;
        }
        return cnt;
    }
}