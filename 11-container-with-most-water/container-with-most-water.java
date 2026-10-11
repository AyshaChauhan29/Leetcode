class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n-1;
        int maxWater = 0;

        while(low < high){
           int width = high - low;
           int ht = Math.min(height[low], height[high]);
           int area = ht * width;

           maxWater = Math.max(maxWater, area);

           if(height[low] < height[high]){
            low++;
            }else{
            high--;
            }
        }
        return maxWater;
    }
}