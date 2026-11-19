class Solution {
    public List<Integer> countSmaller(int[] nums) {
    //     ArrayList<Integer> li = new ArrayList<>();
    //     int count = 0;

    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[j] < nums[i]) count++;
    //         }

    //         li.add(count);
    //         count = 0;
    //     }
    //  return li;

         

        int n = nums.length;
        Integer[] ans = new Integer[n];
        List<Integer> li = new ArrayList<>();  

        for (int i = n - 1; i >= 0; i--) {
   
            int lo = 0, hi = li.size();
            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (li.get(mid) < nums[i]) {
                    lo = mid + 1;            
                } else {
                    hi = mid;              
                }
            }

            ans[i] = lo;

            // insert at lo so the list stays sorted
            li.add(lo, nums[i]);
        }
        return Arrays.asList(ans);
    }
}