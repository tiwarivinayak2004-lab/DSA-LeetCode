class Solution {
    public int countCommas(int n) {
        int total=0;
        if(n>999){
            total=(n-1000)+1;
        }
        else{
            total=0;
        }
        return total;
    }
}