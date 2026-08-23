class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        int[] arr=nums;
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        int prev=lower;

        for(int num: arr){
            if(num<lower || num>upper){
                continue;
            }
            if(num<prev){
                continue;
            }
            if(num>prev){
                res.add(Arrays.asList(prev,num-1));
            }
            prev=num+1;
        }
        if(prev<=upper){
            res.add(Arrays.asList(prev,upper));
        }
        return res;
    }
}