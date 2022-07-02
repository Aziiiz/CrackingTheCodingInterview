package TreesAndGraphs;
import java.util.*;


public class BuildOrder {

    boolean hasCycle = false;
    private List<Integer> buildOrder(int n, int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> visited = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) map.put(i, new ArrayList<>());

        for(int i=0; i<edges.length; i++) {
            map.get(edges[i][0]).add(edges[i][1]);
        }

        for(int i=0; i<n; i++) {
            if(hasCycle) return list;
            dfs(i, map, visited, set, list);
        }

        return list;
    }

    private void dfs(int node, Map<Integer, List<Integer>> map, Set<Integer> visited, Set<Integer> cycle, List<Integer> list) {

        if(cycle.contains(node)) {
            hasCycle = true;
            return;
        }
        if(visited.contains(node)) {
            return;
        }

        cycle.add(node);

        for(int edge : map.get(node)) {
            if(hasCycle) return;
            dfs(edge, map, visited, cycle, list);
        }
        visited.add(node);
        cycle.remove(node);
        list.add(node);
    }
}
