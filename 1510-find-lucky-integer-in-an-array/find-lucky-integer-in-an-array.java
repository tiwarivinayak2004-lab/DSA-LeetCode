class Solution {
    public int findLucky(int[] arr) {
        int[] ans=new int[501];
        for(int x:arr){
            ans[x]++;
        }
        for(int i=500;i>=1;i--){
            if(i==ans[i]){
                return i;
            }
        }
        return -1;
    }
}