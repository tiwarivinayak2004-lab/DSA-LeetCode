class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean flag=true;
            if(i%10==0) continue;
            int num=i;
            while(num>0){
                int a=num%10;
                if(a==0){
                    num=num/10;
                    flag=false;
                    continue;
                }
                if(i%a==0){
                    num=num/10;
                }
                else{
                    flag=false;
                    num=num/10;
                }
            }
            if(flag==true){
                ans.add(i);
            }
        }
        return ans;
    }
}