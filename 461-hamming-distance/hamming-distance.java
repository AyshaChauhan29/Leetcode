class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        while(z != 0) {
           if(z % 2 == 1){
            count++;
           }
           z = z / 2;
        }
        return count;
    }
}

// Time O(log n)  ---> In Every iteration, z is halved
// Space O(1)