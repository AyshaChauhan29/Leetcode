class Solution {
    public int firstMatchingIndex(String s) {
        
        char[] ch = s.toCharArray();
        int n = ch.length;


        // "for(int i=0; i<n; i++){
        //     if(s.charAt(i) == s.charAt(n-i-1)){
        //         return i;
        //         break;
        //     }     
        // }
        // return -1;"


        int low = 0;
        int high = n-1;

        while(low <= high){
           if(ch[low] == ch[high])
           return low;

           low++;
           high--;
        }
        return -1;
    }
}