class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
            for(int ele : nums){
                if(ele%2 == 0)
                map.put(ele, map.getOrDefault(ele, 0)+1);
            }
        
        // Step 2: Return -1 if no even elements found
    if (map.isEmpty()) return -1;                      // ✅ handle no even case

    // Step 3: Find the max frequency
    int maxFreq = 0;
    for (int freq : map.values()) {
        maxFreq = Math.max(maxFreq, freq);             // ✅ track max frequency
    }

    // Step 4: Find smallest element with max frequency
    int result = Integer.MAX_VALUE;
    for (int key : map.keySet()) {
        if (map.get(key) == maxFreq) {                 // ✅ use key inside loop
            result = Math.min(result, key);            // ✅ pick smallest
        }
    }

    return result;
        
    }
}