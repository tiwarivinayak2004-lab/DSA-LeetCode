class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;

        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);

            if((s.length())%2!=0) continue;

            int half=s.length()/2;
            int sum1=0;
            int sum2=0;

            for(int j =0;j<half;j++){
                sum1+=s.charAt(j)-'0';
                sum2+=s.charAt(j+half)-'0';
            }
            if(sum1==sum2) ans++;
        }
        return ans;
    }
}