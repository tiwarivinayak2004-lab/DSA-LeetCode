class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        int len1=nums1.length;
        int len2=nums2.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<len1;i++){
            if(set.contains(nums1[i])){
                continue;
            }
            set.add(nums1[i]);
        }
        int k=0;
        for(int i=0;i<len2;i++){
            if(set.contains(nums2[i])){
                res.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int size=res.size();
        int ans[]=new int[size];
        for(int i=0;i<size;i++){
            ans[i]=res.get(i);
        }
        return ans;
        
    }
}