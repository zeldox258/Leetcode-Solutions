
class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        Integer[] order = new Integer[indices.length];
        for (int i = 0; i < order.length; i++) order[i] = i;
        Arrays.sort(order, (a, b) -> indices[a] - indices[b]);
        StringBuilder sb = new StringBuilder(); int prev = 0;
        for (int i : order) {
            int idx = indices[i]; String src = sources[i], tgt = targets[i];
            if (s.startsWith(src, idx)) { sb.append(s, prev, idx); sb.append(tgt); prev = idx + src.length(); }
        }
        sb.append(s.substring(prev));
        return sb.toString();
    }
}
