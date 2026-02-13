class Solution {
    public int numberOfChild(int n, int k) {
        int child = 0;          // Start at child 0
        int direction = 1;      // 1=right, -1=left
        
        for(int t = 0; t < k; t++) {
            child += direction;     // Pass to next child
            
            if(child == n-1) direction = -1;   // Right end → turn left
            if(child == 0) direction = 1;      // Left end → turn right
        }
        return child;
    }
}