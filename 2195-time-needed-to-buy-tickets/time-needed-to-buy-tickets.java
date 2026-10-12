class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        //Optimized Approach 
        // int time = 0;

        // for(int i=0; i<tickets.length; i++){
        //     if(i <= k) {
        //         time += Math.min(tickets[i], tickets[k]);
        //     }else{
        //         time += Math.min(tickets[i], tickets[k]-1);
        //     }
        // }
        // return time;


        //Simulation -> Using Queues
        Queue<Integer> q = new LinkedList<>();

        //store the indices, not just val
        for(int i=0; i<tickets.length; i++){
            q.offer(i);
        }

        int time = 0;
        while (!q.isEmpty()) {
            int i = q.poll();
            tickets[i]--;                     // buy one ticket
            time++;

            if (i == k && tickets[i] == 0) {  // person k is done
                return time;
            }
            if (tickets[i] > 0) {             
                q.offer(i);
            }
        }
        return time;

    }
}