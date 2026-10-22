
class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] p : prerequisites)
            graph[p[0]].add(p[1]);

        int[] state = new int[n]; // 0 = unvisited, 1 = visiting, 2 = visited
        List<Integer> order = new ArrayList<>();

        for (int i = 0; i < n; i++)
            if (!dfs(i, graph, state, order))
                return new int[0];

        return order.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean dfs(int course, List<Integer>[] graph,
                        int[] state, List<Integer> order) {
        if (state[course] == 1) return false; // cycle
        if (state[course] == 2) return true;  // already processed

        state[course] = 1;

        for (int pre : graph[course])
            if (!dfs(pre, graph, state, order))
                return false;

        state[course] = 2;
        order.add(course);
        return true;
    }
}
