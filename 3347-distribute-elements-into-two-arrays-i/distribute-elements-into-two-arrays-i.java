class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;

        // ArrayList<Integer> arr1=new ArrayList<>();
        // ArrayList<Integer> arr2=new ArrayList<>();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] res=new int[n];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int j=0;
        int k=0;
        for(int i=2;i<n;i++){
            if(arr1[j]>arr2[k]){
                j=j+1;
                arr1[j]=nums[i];
                
            }
            else{
                k=k+1;
                arr2[k]=nums[i];
                
            }
        }
        int c=0;
        for(int i=0;i<j+1;i++){
            res[c]=arr1[i];
            c+=1;
        }
        for(int i=0;i<k+1;i++){
            res[c]=arr2[i];
            c+=1;
        }
        return res;
    }
}