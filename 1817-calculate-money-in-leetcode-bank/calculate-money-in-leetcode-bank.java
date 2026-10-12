class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int cnt=1;
        int rep=1;
        for(int day=1;day<=n;day++){
            sum+=cnt;
            cnt+=1;
            if(day%7==0){
                rep++;
                cnt=rep;
            }
        }
        return sum;
    }
}