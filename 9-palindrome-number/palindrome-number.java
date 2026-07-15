class Solution {

    static boolean isPal(int x, int rev, int dummy){
        if(x == 0) return rev == dummy;
        return isPal(x/10, rev * 10 + x % 10, dummy);
    }

    public boolean isPalindrome(int x) {
       if (x < 0) return false;
       return isPal(x, 0, x);
    }
}