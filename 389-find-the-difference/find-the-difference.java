class Solution {
    public char findTheDifference(String s, String t) {

        // By Using XOR Operator
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
    /*    int xor = 0;
        
        for(int i=0; i<ch1.length; i++){
          xor ^= (int)ch1[i];
        }

        for(int i=0; i<ch2.length; i++){
          xor ^= (int)ch2[i]; 
        }
        return (char)xor; // All paired chars cancel out, only extra remains   */


        //Using HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : ch1){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(char c : ch2){
            map.put(c, map.getOrDefault(c, 0) - 1);
            
            if(map.get(c) < 0) return c;
        }
        
        return ' ';
    }
}