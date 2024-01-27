
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>(); stack.push(0);
        while (!stack.isEmpty()) {
            int r = stack.pop();
            if (!visited.add(r)) continue;
            for (int key : rooms.get(r)) stack.push(key);
        }
        return visited.size() == rooms.size();
    }
}
