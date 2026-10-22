class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length > n - 1) {
            return false;
        }

        Set<Integer> visited = new HashSet<Integer>();
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0 ; i < n ; i++)
            adj.add(new ArrayList<>());

        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        return dfs(0, -1 , adj, visited) && visited.size() == n; 
    }

    boolean dfs(int i, int parent, List<List<Integer>> adj , Set<Integer> visited){
        if(visited.contains(i)){
            return false;
        }
        visited.add(i);
        for (int j : adj.get(i)){
            if(j == parent)
                continue;
            if(!dfs(j,i,adj,visited)) 
                return false; 
        }
        return true;
    }
}
