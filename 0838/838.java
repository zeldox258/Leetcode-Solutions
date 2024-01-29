
class Solution {
    public String pushDominoes(String dominoes) {
        char[] d = dominoes.toCharArray(); int n = d.length;
        int[] forces = new int[n];
        int f = 0;
        for (int i = 0; i < n; i++) { if (d[i] == 'R') f = n; else if (d[i] == 'L') f = 0; else f = Math.max(f - 1, 0); forces[i] += f; }
        f = 0;
        for (int i = n - 1; i >= 0; i--) { if (d[i] == 'L') f = n; else if (d[i] == 'R') f = 0; else f = Math.max(f - 1, 0); forces[i] -= f; }
        StringBuilder sb = new StringBuilder();
        for (int v : forces) sb.append(v > 0 ? 'R' : v < 0 ? 'L' : '.');
        return sb.toString();
    }
}
