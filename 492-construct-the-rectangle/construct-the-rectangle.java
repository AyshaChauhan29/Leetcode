class Solution {
    public int[] constructRectangle(int area) {
        int L, W;  
        for(int w = (int)Math.sqrt(area); w >= 1; w--) {
            if(area % w == 0) {  
                W = w;       
                L = area / w;    
                return new int[] {L, W};  
            }
        }
        return null;
    }
}