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


       //through recursion
    /*    if(num <= 9){            //base case
            return num;
        }

        int sum = 0;
        while(num > 0){
                sum += num%10;
                num /= 10;
            }
       return addDigits(sum);                   */


       //THROUGH HASHSET
       HashSet<Integer> set = new HashSet<>();
        
        while (num >= 10) {
            if (set.contains(num) == true) break;
            set.add(num);
            int sum = 0;
            while (num != 0) {
                int rem = num % 10;
                sum = sum + rem;       // add digit (not rem*rem)
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}