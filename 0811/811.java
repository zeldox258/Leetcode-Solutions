
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> cnt = new HashMap<>();
        for (String s : cpdomains) {
            int sp = s.indexOf(' '); int n = Integer.parseInt(s.substring(0, sp));
            String domain = s.substring(sp + 1);
            String[] parts = domain.split("\.");
            for (int i = 0; i < parts.length; i++) {
                String sub = String.join(".", Arrays.copyOfRange(parts, i, parts.length));
                cnt.put(sub, cnt.getOrDefault(sub, 0) + n);
            }
        }
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> e : cnt.entrySet()) res.add(e.getValue() + " " + e.getKey());
        return res;
    }
}
