class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[V+1];
        Queue<Integer> q = new LinkedList<>();
        visited[0]=true;
        q.add(0);
        while(q.isEmpty()==false)
        {
            int u = q.poll();
            ans.add(u);
            for(int it: adj.get(u))
            {
                if(visited[it]==false)
                {
                    visited[it]=true;
                    q.add(it);
                }
            }
        }
        
    return ans;
}
}
