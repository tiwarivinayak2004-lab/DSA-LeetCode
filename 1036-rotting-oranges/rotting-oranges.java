class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> que=new LinkedList<>();

        int fresh=0;
        int minutes=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    que.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        int[][] dir={
            {-1,0},{1,0},{0,-1},{0,1}
            };

        while(!que.isEmpty() && fresh>0){
            int size=que.size();
            boolean rotted=false;

            for(int i=0;i<size;i++){
                int[] curr=que.poll();
                int r=curr[0];
                int c=curr[1];

                for(int[] d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];

                    if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;
                        que.offer(new int[]{nr,nc});
                        rotted=true;
                    }
                }
            }
            if(rotted){
                minutes++;
            }
        }
        return fresh==0? minutes:-1;
    }
}