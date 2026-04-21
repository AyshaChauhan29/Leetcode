class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
    /*    while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
        }
        
        return n == 1;
    }
    
    private int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;         */


    while(n != 1) {
        if(set.contains(n) == true) return false;
        set.add(n);
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum = sum + rem*rem;
            n = n / 10;
        }
        n = sum;
    }
    return true;

    }
}