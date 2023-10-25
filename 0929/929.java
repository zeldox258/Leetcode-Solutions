
class Solution {
    public int numUniqueEmails(String[] emails) {
        java.util.Set<String> s = new java.util.HashSet<>();
        for (String e : emails) {
            String[] parts = e.split("@");
            String local = parts[0].split("\+")[0].replace(".", "");
            s.add(local + "@" + parts[1]);
        }
        return s.size();
    }
}
