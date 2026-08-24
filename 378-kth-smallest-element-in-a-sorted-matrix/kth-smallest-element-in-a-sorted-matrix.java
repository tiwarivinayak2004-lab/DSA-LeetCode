class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            int row1=a[0],col1=a[1],row2=b[0],col2=b[1];
            int value1=matrix[row1][col1];
            int value2=matrix[row2][col2];
            return value1-value2;
        });
        for(int i=0;i<matrix.length;i++){
            pq.add(new int[]{i,0});
        }
        while(k-->1){
            int[] currele=pq.remove();
            int curreleRow=currele[0];
            int curreleCol=currele[1];
            curreleCol++;
            if(curreleCol<matrix[0].length){
                pq.add(new int[]{curreleRow,curreleCol});
            }
        }
        int[] ans=pq.remove();
        int ansrow=ans[0];
        int anscol=ans[1];
        return matrix[ansrow][anscol];
    }
}