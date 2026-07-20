class Solution {
    public boolean rotateString(String s, String goal) {
        //if dono strs ki length same nhi h then after rotation strs cant be equal
        if(s.length() != goal.length()) return false;
        
        //if goal str is substring of (s+s) then rotation is possible else...
        return (s + s).contains(goal);
    }
}