class Solution {
    public boolean areNumbersAscending(String s) {
        
        ArrayList<Integer> li = new ArrayList<>();

        String[] arr = s.split(" ");
        int n = arr.length;
 
        for(int i=0; i<n; i++){
            if (Character.isDigit(arr[i].charAt(0))) {
                li.add(Integer.parseInt(arr[i]));
            }
        }

        for(int i=0; i<li.size()-1; i++){
            if(li.get(i) >= li.get(i+1)) return false;
        }
        return true;
    }
}