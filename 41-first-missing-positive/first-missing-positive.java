class Solution {
    public int firstMissingPositive(int[] nums) {
       int n = nums.length;
       HashSet<Integer> set = new HashSet<>();
       for(int ele : nums){
        set.add(ele);
       }

       for(int i=1; i<=n+1; i++){
          if(set.contains(i) == false) return i;
       }
       return -1;
    }
}