
class Solution {
    int[] parent;
    int find(int x) { return parent[x] == x ? x : (parent[x] = find(parent[x])); }
    void union(int x, int y) { parent[find(x)] = find(y); }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> emailToId = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();
        int id = 0;
        for (List<String> acc : accounts) {
            String name = acc.get(0);
            for (int i = 1; i < acc.size(); i++) {
                emailToName.put(acc.get(i), name);
                if (!emailToId.containsKey(acc.get(i))) emailToId.put(acc.get(i), id++);
            }
        }
        parent = new int[id];
        for (int i = 0; i < id; i++) parent[i] = i;
        for (List<String> acc : accounts) {
            for (int i = 2; i < acc.size(); i++) union(emailToId.get(acc.get(1)), emailToId.get(acc.get(i)));
        }
        Map<Integer, List<String>> groups = new HashMap<>();
        for (String email : emailToId.keySet()) {
            int root = find(emailToId.get(email));
            groups.computeIfAbsent(root, k -> new ArrayList<>()).add(email);
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> group : groups.values()) {
            Collections.sort(group);
            group.add(0, emailToName.get(group.get(0)));
            res.add(group);
        }
        return res;
    }
}
