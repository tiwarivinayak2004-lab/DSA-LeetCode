class Solution {
    public int addDigits(int num) {
        int temp=num;
        int sum=0;
        if(num==0) return num;
        if(countDig(num)==1){
                return num;
            }
        while(true){
            while(temp>0){
                int a=temp%10;
                sum+=a;
                temp=temp/10;
            }
            if(countDig(sum)==1){
                return sum;
            }
            else{
                temp=sum;
                sum=0;
            }
        }
    }
    private int countDig(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}