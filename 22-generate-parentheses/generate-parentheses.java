class Solution {

    static void helper(int n, int lc, int rc, String curr, List<String> li){

        if(curr.length() == 2*n){
            li.add(curr);
            return;
        }

        if(lc < n){
            helper(n, lc+1, rc, curr + "(" , li);
        }

        if(rc < lc){
            helper(n, lc, rc+1, curr + ")" , li);
        }
    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> li = new ArrayList<>();
        helper(n, 0, 0, "", li);
        return li;
    }
}  