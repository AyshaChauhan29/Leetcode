class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int ans = n / 4;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > ans){
                return key;
            }
        }
        return 0;
    }
}