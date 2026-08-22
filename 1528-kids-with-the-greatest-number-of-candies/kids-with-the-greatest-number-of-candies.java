class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int max=maxEle(candies);
        for(int i=0;i<candies.length;i++){
            int total=candies[i]+extraCandies;
            if(total>=max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;

    }
    public int maxEle(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}