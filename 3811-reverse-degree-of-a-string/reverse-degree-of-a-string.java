class Solution {
    public int reverseDegree(String s) {
        int prod = 1;
        int sum = 0;

       for(int i=0; i<s.length(); i++){
          char c = s.charAt(i);
          int revIdx = 'z' - c + 1;
          prod *= revIdx * (i+1);
          sum += prod;

          prod = 1;
       }
       return sum;
    }
}