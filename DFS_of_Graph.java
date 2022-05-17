class Solution {
    // Function to return a list containing the DFS traversal of the graph.
   
    public void DFSRec(int node, boolean[] visited, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj)
    {
        ans.add(node);
        visited[node]=true;
        for(Integer it: adj.get(node))
        {
            if(visited[it]==false)
                DFSRec(it,visited,ans,adj);
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[]= new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
                DFSRec(i,visited,ans,adj);
        }
        return ans;
    }
}
