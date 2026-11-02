class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        
        //Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        //Calculate indegrees and create edges
        int[] inDeg = new int[n];
        
        for(int[] a : prerequisites) {
            
            int course = a[0];
            int pre = a[1];
            
            // Edge: pre -> course
            adj.get(pre).add(course);
            
            // Increase indegree of course
            inDeg[course]++;
        }
        
        //Add all vertices with indegree 0
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < n; i++) {
            if(inDeg[i] == 0) {
                q.offer(i);
            }
        }
        
        //Process nodes using Kahn's Algorithm
        int count = 0;
        while(!q.isEmpty()) {
            
            int node = q.poll();
            count++;
            
            // Visit all neighbours of current node
            for(int ele : adj.get(node)) {
                
                inDeg[ele]--;
                
                // If indegree becomes 0, add to queue
                if(inDeg[ele] == 0) {
                    q.offer(ele);
                }
            }
        }
        
        //Check if all courses can be completed
        return count == n;
    }
}