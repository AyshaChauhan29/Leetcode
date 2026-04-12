class Solution {

    public int sum(int x){
        int s = 0;
        while(x != 0){
            s = s + x % 10;
            x = x / 10;
        }
        return s;
    }

    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int x = nums[i];
            if(sum(x) == i){
                return i;
            }
        }
        return -1;
    }
}