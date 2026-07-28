class Solution {
    public String smallestPalindrome(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        int n = ch.length;

        char[] ans = new char[n];

        int left = 0;
        int right = n - 1;

        int i = 0;

        while (i < n) {

            if (i == n - 1 || ch[i] != ch[i + 1]) {
                ans[n / 2] = ch[i];
                i++;
            } 
            else {
                ans[left++] = ch[i];
                ans[right--] = ch[i];
                i += 2;
            }
        }

        return new String(ans);
    }
}