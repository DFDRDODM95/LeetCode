import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Map<Integer, Boolean> visited = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited.put(0, true);

        while (!queue.isEmpty()) {
            int curVertex = queue.poll();
            for (int nextVertex: rooms.get(curVertex)) {
                if (!visited.containsKey(nextVertex)) {
                    queue.offer(nextVertex);
                    visited.put(nextVertex, true);
                }
            }
        }
        
        for (int i = 0; i < rooms.size(); i++) {
            if (!visited.containsKey(i)) visited.put(i, false);
        }
        for (Boolean value : visited.values()) {
            if (value.equals(false)) return false;
        }
        return true;
    }
}