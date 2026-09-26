class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sourcesum=0;
        long sourcetarget=0;
        for(int x:source){
            sourcesum+=x;
        }
        for(int x:target){
            sourcetarget+=x;
        }
        return sourcesum==sourcetarget;
    }
}