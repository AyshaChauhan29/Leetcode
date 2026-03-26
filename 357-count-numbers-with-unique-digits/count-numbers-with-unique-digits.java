class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;  // only x=0

        int total = 10;        // covers n=1: digits 0-9 = 10 numbers
        int uniqueDigits = 9;  // first digit choices (1-9)
        int availDigits  = 9;  // remaining choices for next digit

        for (int d = 2; d <= n; d++) {
            uniqueDigits *= availDigits;  // multiply available choices
            total        += uniqueDigits;
            availDigits--;               // one less digit available next round
        }

        return total;
    }
}