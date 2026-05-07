class Solution {
    public char findTheDifference(String s, String t) {
     /*   int sumS = 0;
        int sumT = 0;
        
        for (char c : s.toCharArray()) {
            sumS += c;   // same as (int)c
        }
        for (char c : t.toCharArray()) {
            sumT += c;
        }
        
        return (char)(sumT - sumS);               */


// also sove with hashset
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int xor = 0;
        
        for(int i=0; i<ch1.length; i++){
          xor ^= (int)ch1[i];
        }

        for(int i=0; i<ch2.length; i++){
          xor ^= (int)ch2[i]; 
        }
        return (char)xor;
    }
}