class Solution {
    public int maxProduct(int n) {
        //Brute Force Approach
        // int maxProd = Integer.MIN_VALUE;
        // int prod = 1;

        // String s = Integer.toString(n);

        // for(int i=0; i<s.length(); i++){
        //     for(int j=i+1; j<s.length(); j++){
        //        int num1 = s.charAt(i) - '0';
        //        int num2 = s.charAt(j) - '0';

        //        prod = num1 * num2;
        //        maxProd = Math.max(maxProd, prod);
        //     }   
        // }    
        // return maxProd;


        //Sorting Approach

        String s = Integer.toString(n);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        int max = ch[ch.length-1] - '0';
        int secMax = ch[ch.length-2] - '0';

        return max * secMax;
    }
}