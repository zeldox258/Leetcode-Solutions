
class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    Map<Integer, List<Integer>> children = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees) { map.put(e.id, e.importance); children.put(e.id, e.subordinates); }
        return dfs(id);
    }
    int dfs(int id) {
        int res = map.get(id);
        for (int c : children.get(id)) res += dfs(c);
        return res;
    }
}
