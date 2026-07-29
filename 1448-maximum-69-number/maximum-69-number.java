class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int placeValue = 1;     
        int leftmostSixPos = -1; 

        while (temp > 0) {
            int digit = temp % 10; 
            
            if (digit == 6) {
                leftmostSixPos = placeValue; 
            }
            
            temp = temp / 10;    
            placeValue = placeValue * 10;
        }

        if (leftmostSixPos != -1) {
            return num + (3 * leftmostSixPos);
        }
        return num;

    }
}