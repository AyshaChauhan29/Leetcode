class Solution {

    static int product(int n){
        int prod = 1;
        while(n != 0){
            int rem = n % 10;
            prod *= rem;
            n = n / 10;
        }
        return prod;
    }


    public int smallestNumber(int n, int t) {
        int temp = n;

        while(true){
            if(product(temp) % t == 0) return temp;
            temp++;
        }
    }
}