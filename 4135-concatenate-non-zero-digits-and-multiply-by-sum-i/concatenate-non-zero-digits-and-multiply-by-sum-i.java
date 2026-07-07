class Solution {
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
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

        return (long) origX * sum;
    }
}