class Solution {

    static int combineDig(int x, int y, int z) {
        return x * 100 + y * 10 + z;
    }

    public int totalNumbers(int[] digits) {
        int n = digits.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0)
                continue;

            for (int j = 0; j < n; j++) {
                if (j == i)
                    continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j)
                        continue;

                    if (digits[k] % 2 != 0)
                        continue;

                    int num = combineDig(digits[i], digits[j], digits[k]);

                    set.add(num);
                }
            }
        }

        return set.size();
    }
}