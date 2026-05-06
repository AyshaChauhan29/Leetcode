class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);  
        }

        int max = -1;
        for(int key : map.keySet()) {
            if(map.get(key) == key) {
                max = Math.max(key, max);
            }
        }
        return max;
    }
}