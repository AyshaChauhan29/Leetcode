class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //t.c. => nlogn + o(n)
       int n = people.length;
       Arrays.sort(people);
       int count = 0;

       int low = 0;
       int high = n-1;

       while(low <= high){
        if(people[low]+people[high] <= limit){
            count++;
            low++;
            high--;
        }else {
            count++;
            high--;
        }
       }
       return count;
    }
}