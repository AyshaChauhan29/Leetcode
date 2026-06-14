class Solution {
    public int hammingWeight(int n) {
    //    int count =0;
    //    while(n != 0){
    //     if(n%2 == 1) count++;
    //     n = n/2;
    //    }
    //    return count;

       String s = Integer.toBinaryString(n);
       int count = 0;
       for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == '1') count++;
       }
       return count;
    }
}