class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr=nums;
        List<Integer> res=new ArrayList<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=Math.abs(arr[i]);
            arr[ans-1]=-Math.abs(arr[ans-1]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
}