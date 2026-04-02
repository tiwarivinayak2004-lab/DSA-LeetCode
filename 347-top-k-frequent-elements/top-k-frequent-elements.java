class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] buck=new ArrayList[nums.length+1];
        for(int i=0;i<buck.length;i++){
            buck[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            buck[freq].add(num); 
        }

        List<Integer> res= new ArrayList<>();
        for(int i=buck.length-1;i>=0;i--){
            if(!buck[i].isEmpty()){
                res.addAll(buck[i]);
                if(res.size()>=k){
                    break;
                }
            }
        }
        int resArray[]=new int[k];
        for(int i=0;i<k;i++){
            resArray[i]=res.get(i);
        }
        return resArray;
    }
}