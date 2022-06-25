package TreesAndGraphs;

import java.util.*;

public class RouteBetweenNodes {
    boolean ans;
    public boolean routeBetweenNodes(int n, int[][] edges, int source, int destination) {
        if(n < destination) return false;
        Set<Integer> set = new HashSet<>();
        Map<Integer,List<Integer>> map  = new HashMap<>();

        for(int i=0; i<edges.length; i++) {
            if(!map.containsKey(edges[i][0])) {
                map.put(edges[i][0], new ArrayList<>());
            }
            if(!map.containsKey(edges[i][1])) {
                map.put(edges[i][1], new ArrayList<>());
            }
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        return bfs(map, source, destination, set);
    }

    // dfs approach
    private boolean dfs(Map<Integer,List<Integer>> map, int source, int dest, Set<Integer> set) {

        set.add(source);

        if(source  == dest) {
            ans = true;
            return true;
        }
        for(int edge : map.get(source)) {
            if(!set.contains(edge)) dfs(map, edge, dest, set);
        }
        return ans;
    }

    // bfs approach
    private boolean bfs(Map<Integer, List<Integer>> map, int source, int dest, Set<Integer> set) {

        if(source  == dest) {

            return true;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(source);
        set.add(source);

        while(!queue.isEmpty()) {
            int edge = queue.poll();
            for(int next : map.get(edge)) {
                if(next == dest) return true;
                if(!set.contains(next)) {
                    queue.add(next);
                    set.add(next);
                }
            }
        }
        return false;
    }

}
