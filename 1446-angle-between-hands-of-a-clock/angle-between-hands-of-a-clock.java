class Solution {
    public double angleClock(int hour, int minutes) {
       
        double angle = Math.abs((11.0/2 * minutes) - 30 * hour);
        return Math.min(angle, 360-angle);
    }
}