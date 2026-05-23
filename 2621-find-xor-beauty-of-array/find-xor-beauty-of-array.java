class Solution {
    public int xorBeauty(int[] nums) {
        int xor = 0;
        for(int ele : nums){
            xor ^= ele;
        }
        return xor;
    }
}