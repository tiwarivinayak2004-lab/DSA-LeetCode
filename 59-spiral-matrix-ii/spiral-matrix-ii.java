class Solution {
    public int[][] generateMatrix(int n) {
        int left=0,right=n-1;
        int top=0,bottom=n-1;
        int ans[][]=new int[n][n];
        int cnt=1;

        while(left<=right){

        for(int i=left;i<=right;i++){
            ans[top][i]=cnt++;
        }
        top++;

        for(int i=top;i<=bottom;i++){
            ans[i][right]=cnt++;
        }
        right--;

        if(top<=bottom){
            for(int i=right;i>=left;i--){
                ans[bottom][i]=cnt++;
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                ans[i][left]=cnt++;
            }
            left++;
        }
        }
        return ans;
    }
}