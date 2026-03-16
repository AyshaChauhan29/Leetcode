class Solution {
    public int mirrorDistance(int n) {
    
        int rev = 0;
        int dummy = n;

        while (dummy != 0) {
            int rem = dummy % 10;
            rev = rev * 10 + rem;
            dummy = dummy / 10;
        }

        return Math.abs(n - rev);
    }
}