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

        int score = 0;
        for(int key : map.keySet()){
            int ans = map.get(key);    
            score += key * ans;
        }
        return score;
    }
}