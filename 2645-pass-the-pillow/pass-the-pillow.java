class Solution {
    public int passThePillow(int n, int time) {
        int pop = 1;   //position of person
        int dir = 1;   //forward->1, backward->-1
        for(int t=0; t<time; t++){
            pop = pop + dir;   //move pillow
            
            if(pop == n){      //hit right end
                dir = -1;      //backwards
            }

            if(pop == 1){      //hits left end
                dir = 1;       //move forwards
            }
        }
        return pop;
    }
}