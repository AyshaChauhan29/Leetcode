class Solution {
    public int maxProduct(int n) {

        int maxProd = Integer.MIN_VALUE;
        int prod = 1;

        String s = Integer.toString(n);

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
               int num1 = s.charAt(i) - '0';
               int num2 = s.charAt(j) - '0';

               prod = num1 * num2;
               maxProd = Math.max(maxProd, prod);
            }   
        }    
        return maxProd;
    }
}