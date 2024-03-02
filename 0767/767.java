
class Solution {
    public String reorganizeString(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) cnt[c - 'a']++;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 26; i++) if (cnt[i] > 0) pq.offer(new int[]{i, cnt[i]});
        StringBuilder sb = new StringBuilder();
        while (pq.size() >= 2) {
            int[] a = pq.poll(), b = pq.poll();
            sb.append((char)('a' + a[0])); sb.append((char)('a' + b[0]));
            if (--a[1] > 0) pq.offer(a); if (--b[1] > 0) pq.offer(b);
        }
        if (!pq.isEmpty()) {
            int[] a = pq.poll();
            if (a[1] > 1) return "";
            sb.append((char)('a' + a[0]));
        }
        return sb.toString();
    }
}
