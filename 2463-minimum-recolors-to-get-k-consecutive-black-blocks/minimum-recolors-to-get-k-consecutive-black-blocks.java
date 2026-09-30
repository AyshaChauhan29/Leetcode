class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                count++;
            }
        }

        int ans = count;

        // Move the window
        for (int i = k; i < blocks.length(); i++) {

            // New character entering window
            if (blocks.charAt(i) == 'W') {
                count++;
            }

            // Character leaving window
            if (blocks.charAt(i - k) == 'W') {
                count--;
            }

            ans = Math.min(ans, count);
        }

        return ans;
    }
}