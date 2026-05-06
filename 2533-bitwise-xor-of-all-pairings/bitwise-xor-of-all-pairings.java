class Solution {        //
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int xor = 0;

      //BRUTE FORCE
     /*   for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                xor = xor ^ (nums2[j] ^ nums1[i]);
            }
        }
        return xor;    */

        
        if(n%2  != 0){
            for(int i=0; i<m; i++){
                xor = xor ^ nums2[i];
            }
        }

        if(m%2  != 0){
            for(int i=0; i<n; i++){
                xor = xor ^ nums1[i];
            }
        }
        return xor;
    }
}


//cloudfare