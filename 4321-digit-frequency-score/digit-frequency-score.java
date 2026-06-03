class Solution {
    public int digitFrequencyScore(int n) {
        // int sum = 0;
        // while(n != 0){
        //     sum = sum + n % 10;
        //     n = n / 10;
        // }
        // return sum;

        
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n != 0) {
            int rem = n % 10;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
            n = n / 10;
        }

        int ans = 0;
        for(int key : map.keySet()){
           // int ans = map.get(key);    
            ans = ans + key * map.get(key);
        }
        return ans;
    }
}