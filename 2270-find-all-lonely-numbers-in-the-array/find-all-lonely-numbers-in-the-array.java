class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1){
                if(!map.containsKey(key+1) && !map.containsKey(key-1)){
                    li.add(key);
                }    
            }
        }
        return li;
    }
}