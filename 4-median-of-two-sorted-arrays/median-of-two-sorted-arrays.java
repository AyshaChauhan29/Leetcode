class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] ans = new int[n + m];

        for (int i = 0; i < n; i++) {
            ans[i] = nums1[i];
        }

        for (int i = 0; i < m; i++) {
            ans[n + i] = nums2[i];
        }

        Arrays.sort(ans);
        int len  = ans.length;

       for(int i=0; i<len; i++){
          if(len%2 == 0){
             return (ans[len/2-1] + ans[len/2])/2.0;
          }else{
            return ans[len/2];
          }
       }                   
        return 0;





    //    ArrayList<Integer> li = new ArrayList<>();

    //    for(int i=0; i<nums1.length; i++){
    //     li.add(nums1[i]);
    //    }

    //    for(int i=0; i<nums2.length; i++){
    //     li.add(nums2[i]);
    //    }

    //    Collections.sort(li);
    //    int n = li.size();

    //    if(n % 2 == 0){
    //      return (li.get(n/2) + li.get(n/2-1))/2.0;
    //    }else{
    //     return li.get(n/2);
    //    }

    }
}