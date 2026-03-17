class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=numRows;row++)
        {
            List<Integer> tempList=new ArrayList<>();
            for(int col=1;col<=row;col++)
            {
                tempList.add(nCr(row-1,col-1));
            }
            ans.add(tempList);
        }
        return ans;
    }
    public int nCr(int a,int b)
    {
        long res=1;
        for(int i=0;i<b;i++)
        {
            res=res*(a-i);
            res=res/(i+1);
        }
        return (int) res;
    }
}