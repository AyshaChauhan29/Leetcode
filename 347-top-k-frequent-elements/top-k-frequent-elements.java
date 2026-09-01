class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        
        ArrayList<Integer> li = new ArrayList<>();
        for(int key : map.keySet()){
            li.add(key);
        }

        int[] ans = new int[k];
    
        for(int i=0; i<k; i++){
            int maxFreq = -1;
            int maxEle = 0;

            for (int j = 0; j < li.size(); j++) {

                int ele = li.get(j);
                int freq = map.get(ele);

                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxEle = ele;
                }
            }

            ans[i] = maxEle;

            // Remove it so we don't select it again
            li.remove(Integer.valueOf(maxEle));
        }
        return ans;
    }
}