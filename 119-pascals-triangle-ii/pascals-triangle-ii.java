class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            int ans=nCr(rowIndex,i);
            res.add(ans);
        }
        return res;
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