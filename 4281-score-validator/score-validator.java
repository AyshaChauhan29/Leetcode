class Solution {
    public int[] scoreValidator(String[] events) {
    /*    int score = 0;
        int count = 0;
        
        for(int i=0; i<events.length; i++){
            if(count == 10) break;

            String s = events[i];
            
            if(s.equals("W")){
                count++;
            }else if(s.equals("WD") || s.equals("NB")){
                score += 1;
            }else{
                score += Integer.parseInt(s);
            }
        }
        return new int[]{score, count};    */
        int n = events.length;
        int count = 0;
        int score = 0;
        int[] res = new int[2];

        for(int i=0; i<n; i++){
            String s = events[i];
            if(count == 10) break;

            if(s.equals("W")){
                count++;
            }else if(s.equals("0")){
                continue;
            }
            else if(s.equals("1")){
                score += 1;
            }
            else if(s.equals("2")){
                score += 2;
            }
            else if(s.equals("3")){
                score += 3;
            }
            else if(s.equals("4")){
                score += 4;
            }
            else if(s.equals("6")){
                score += 6;
            }
            else {
                score += 1;
            }
        }
        res[0] = score;
        res[1] = count;
        return res;
    }
}