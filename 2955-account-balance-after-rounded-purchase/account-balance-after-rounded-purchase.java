class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rem1=purchaseAmount%10;
        if(rem1==0) return 100-purchaseAmount;
        if(rem1<5){
            int total=purchaseAmount-rem1;
            return 100-total;
        }
        if(rem1>=5){
            int req=10-rem1;
            int total=purchaseAmount+req;
            return 100-total;
        }
        return 0;

    }
}