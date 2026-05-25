class Solution {
    public int findDuplicate(int[] nums) {
     int n = nums.length;
    //  Arrays.sort(nums);

    //  for(int i=0; i<=n; i++){
    //     if(nums[i] == nums[i+1]) return nums[i];
    //     else return nums[n-1];
    //  }
    //  return -1;

    HashMap<Integer, Integer> map = new HashMap<>();
    for(int ele : nums){
        map.put(ele, map.getOrDefault(ele, 0)+1);
    }

    for(int key : map.keySet()){
        if(map.get(key) >= 2) return key;
    }
     return -1;

    }
}