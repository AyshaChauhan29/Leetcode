class Solution {
    public int maxDistinct(String s) {
        char[] ch = s.toCharArray();
        // int n = s.length();
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int ele : ch){
        //     map.put(ele, map.getOrDefault(ele, 0)+1);
        // }
        // return map.size();

        HashSet<Character> set = new HashSet<>();
        for(char c : ch){
            set.add(c);
        }
        return set.size();
    }
}