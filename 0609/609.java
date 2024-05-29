
class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] parts = path.split(" ");
            String dir = parts[0];
            for (int i = 1; i < parts.length; i++) {
                int idx = parts[i].indexOf('(');
                String content = parts[i].substring(idx+1, parts[i].length()-1);
                String file = dir + "/" + parts[i].substring(0, idx);
                map.computeIfAbsent(content, k -> new ArrayList<>()).add(file);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> list : map.values()) if (list.size() > 1) res.add(list);
        return res;
    }
}
