class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int n=height.length;
        int l=0,r=n-1;
        while(l<r){
            int width=r-l;
            int h=Math.min(height[l],height[r]);
            int area=width*h;

            maxArea=Math.max(maxArea,area);

            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxArea;
    }
}