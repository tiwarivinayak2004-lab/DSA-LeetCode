class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
       fun(0,new ArrayList<>(),candidates,target);
       return res; 
    }
    public void fun(int ind,List<Integer> sublist,int[] num,int target)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(sublist));
            return;
        }
        for(int i=ind;i<num.length;i++)
        {
            if(i>ind && num[i]==num[i-1]) continue;
            if(num[i]>target) break;

            sublist.add(num[i]);
            fun(i+1,sublist,num,target-num[i]);
            sublist.remove(sublist.size()-1);
        }
    }
}