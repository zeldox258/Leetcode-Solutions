
class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if (dead.contains("0000")) return -1;
        Queue<String> q = new LinkedList<>(); q.offer("0000");
        Set<String> visited = new HashSet<>(); visited.add("0000");
        int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String cur = q.poll();
                if (cur.equals(target)) return steps;
                char[] ch = cur.toCharArray();
                for (int j = 0; j < 4; j++) {
                    for (int d : new int[]{1, -1}) {
                        char orig = ch[j]; ch[j] = (char)((ch[j] - '0' + d + 10) % 10 + '0');
                        String next = new String(ch);
                        if (!visited.contains(next) && !dead.contains(next)) { visited.add(next); q.offer(next); }
                        ch[j] = orig;
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
