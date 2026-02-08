class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        
        int sum = 0;
        int temp = x;
        while(temp > 0){
          int rem = temp % 10;     //get last digit 
          sum += rem;              // add it to the sum
          temp /= 10;              // remove last digit
        }

        if(sum != 0 && x % sum == 0){
            return sum;
        }
        return -1;
    }
}