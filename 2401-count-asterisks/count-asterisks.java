class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean check = false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '|'){
               check = !check;
            }else{
                if(ch == '*' && !check) count++;
            }
        }
        return count;
    }
}