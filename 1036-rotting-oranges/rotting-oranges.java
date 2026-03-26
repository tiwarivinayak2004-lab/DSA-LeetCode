class Pair{
    int row;int col;int tm;
    Pair(int _row,int _col,int _tm){
        this.row=_row;
        this.col=_col;
        this.tm=_tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        Queue <Pair> q=new LinkedList<>();
        int[][] vis=new int[n][m];
        int cntfresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) cntfresh++;
            }
        }
        int tm=0;
        int drow[]={-1,0,+1,0};
        int dcol[]={0,+1,0,-1};
        int cnt=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max(tm,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=cntfresh) return -1;
        return tm;
    }
    

}

// if(grid==null || grid.length==0) return 0;
//         int row=grid.length;
//         int col=grid[0].length;
//         Queue<int[]> q=new LinkedList<>();
//         int cntfresh=0;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 if(grid[i][j]==2)
//                 {
//                     q.offer(new int[]{i,j});
//                 }
//                 if(grid[i][j]!=0)
//                 {
//                     cntfresh++;
//                 }
//             }
//         }
//         if(cntfresh==0) return 0;
//         int cntmin=0,cnt=0;
//         int dx[]={0,0,1,-1};
//         int dy[]={1,-1,0,0};
//         while(!q.isEmpty())
//         {
//             int size=q.size();
//             cnt+=size;
//             for(int i=0;i<size;i++)
//             {
//                 int[] point=q.poll();
//                 for(int j=0;j<4;j++)
//                 {
//                     int x=point[0]+dx[j];
//                     int y=point[1]+dy[j];

//                     if(x<0 || y<0 || x>=row || y>=col || grid[x][y]==0 || grid[x][y]==2) continue;
//                     grid[x][y]=2;
//                     q.offer(new int[]{x,y});
//                 }
//             }
//             if(q.size()!=0)
//             {
//                 cntmin++;
//             }
//         }
//         return cntfresh==cnt? cntmin:-1;
//     }