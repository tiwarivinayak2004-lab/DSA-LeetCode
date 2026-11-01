class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            while(num>0){
                int a=num%10;
                if(a==0 || i%a!=0){
                    break;
                }
                num=num/10;
            }
            if(num==0){
                ans.add(i);
            }
        }
        return ans;
    }
}