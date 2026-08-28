class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }

        for(int i=1; i<=100; i++){
            int ans = i * k;
           if(!set.contains(ans)) return ans;
        }
     
       return 100 + k; 
    }
}