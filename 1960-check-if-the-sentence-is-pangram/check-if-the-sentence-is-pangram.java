class Solution {
    public boolean checkIfPangram(String sentence) {
        
        HashSet<Character> set = new HashSet<>();
        for(char c : sentence.toCharArray()){
            set.add(c);
        }

        for(char c='a'; c<='z'; c++){
            if(!set.contains(c)) return false;
        }

        return true;
    }
}