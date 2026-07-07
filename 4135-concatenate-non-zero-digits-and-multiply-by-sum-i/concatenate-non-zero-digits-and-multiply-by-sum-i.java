class Solution {
    public long sumAndMultiply(int n) {
    /*    String s = Integer.toString(n);
        String str = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '0') str += s.charAt(i);
        }

         if (str.length() == 0) {
            return 0;
        }

        int x = Integer.parseInt(str);
        int origX = x;

        int sum = 0;
        while (x > 0) {
            int rem = x % 10;
            sum += rem;
            x = x / 10;
        }

        return (long) origX * sum;        */


        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem != 0){
                rev = rev * 10 + rem;
            }
            n = n / 10;
        }

        int x = 0;
        int sum = 0;

        while(rev > 0){
            int rem = rev % 10;
            x = x * 10 + rem;

            sum += rem;     //sum of digits
            rev /= 10;
        }
        return (long)x * sum;
    }
}