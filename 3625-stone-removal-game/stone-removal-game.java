class Solution {
    public boolean canAliceWin(int n){
        if(n < 10) return false;
        int a = 10;

        boolean alice = true;      // true -> Alice's turn, false -> Bob's turn
        while(a > 0 && n >= a){    // current player can remove 'a' stones
            n = n - a;             // remove the stones
            a = a - 1;             // next player removes one less
            alice = !alice;        // switch turn
        }
               
        return !alice;
    }
}