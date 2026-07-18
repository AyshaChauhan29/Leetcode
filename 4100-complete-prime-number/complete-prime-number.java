class Solution {

    static boolean isPrime(int num){
        if (num < 2) return false;

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean completePrime(int num) {
        String s = String.valueOf(num);

        for(int i=1; i<=s.length(); i++){
            int pref = Integer.parseInt(s.substring(0, i));

            if(!isPrime(pref)) return false;
        }

        for(int i=0; i<s.length(); i++){
            int suff = Integer.parseInt(s.substring(i));

            if(!isPrime(suff)) return false;
        }
        return true;
    }
}