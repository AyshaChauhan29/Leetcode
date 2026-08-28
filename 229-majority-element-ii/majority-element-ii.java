class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> li = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                li.add(key);
            }
        }
        return li;
    }
}