class Solution {

    public boolean isUglyNo(int n){
        if(n <= 0) return false;
        if(n == 1) return true;

        if(n % 2 == 0) return isUglyNo(n/2);
        if(n % 3 == 0) return isUglyNo(n/3);
        if(n % 5 == 0) return isUglyNo(n/5);

        return false;
    }

    public boolean isUgly(int n) {
        return isUglyNo(n);
    }
}