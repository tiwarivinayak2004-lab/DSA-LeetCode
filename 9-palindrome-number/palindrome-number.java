class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x>=0 && x<10) return true;

        int cnt=0;
        int temp1=x;
        int temp2=x;
        int sum=0;
        while(temp1>0){
            cnt++;
            temp1=temp1/10;
        }
        while(temp2>0){
            int a=temp2%10;
            sum=sum+(int)(a*Math.pow(10,cnt-1));
            cnt=cnt-1;
            temp2=temp2/10;
        }
        if(sum==x) return true;
        else return false;
    }
}