class Solution {
    public int addDigits(int num) {
       HashSet<Integer> set = new HashSet<>();
       
        
    while(num >= 10){
        if(set.contains(num) == true) break;
        set.add(num);

        int sum = 0;
       while(num != 0){
        sum += num%10;
        num /= 10;
       }
       num = sum;
    }
      return num;
    }
}