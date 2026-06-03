class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    /*    int n = nums1.length;
        int m = nums2.length;

        int[] ans = new int[n + m];

        for (int i = 0; i < a.length; i++) {
            ans[i] = nums1[i];
        }

        for (int i = 0; i < b.length; i++) {
            ans[n + i] = nums2[i];
        }

        Arrays.sort(ans);

       for(int i=0; i<ans.length; i++){
          if(ans.length%2 != 0){
             return ans[n/2-1];
          }else{
            return ans[n/2];
          }
       }                   */

       ArrayList<Integer> li = new ArrayList<>();

       for(int i=0; i<nums1.length; i++){
        li.add(nums1[i]);
       }

       for(int i=0; i<nums2.length; i++){
        li.add(nums2[i]);
       }

       Collections.sort(li);
       int n = li.size();

       if(n % 2 == 0){
         return (li.get(n/2) + li.get(n/2-1))/2.0;
       }else{
        return li.get(n/2);
       }


    }
}