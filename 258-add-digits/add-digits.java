class Solution {
    public int addDigits(int num) {
        //haashset and recursion -----> best approach
      /*  while(num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num%10;
                num /= 10;
            }
            num = sum;
        }
        return num;          */

        if(num <= 9){
            return num;
        }

        int sum = 0;
        while(num > 0){
                sum += num%10;
                num /= 10;
            }
       return addDigits(sum);
    }
}