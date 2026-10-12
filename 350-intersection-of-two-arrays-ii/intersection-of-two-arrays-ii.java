class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(map.getOrDefault(num,0)>0){
                res.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int len=res.size();
        int ans[]=new int[len];
        for(int i=0;i<len;i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}