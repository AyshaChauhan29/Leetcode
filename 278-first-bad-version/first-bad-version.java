/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      
public class Solution extends VersionControl {

    public int isBad(int low, int high){
        if(low > high) return low;

        int mid = low + (high - low)/2;
        if(isBadVersion(mid)) return isBad(low, mid-1);
        else return isBad(mid+1, high);
      }


    public int firstBadVersion(int n) {
        return isBad(1, n);
    }
}