
class Solution {
    Map<String, Integer> memo = new HashMap<>();
    public int findMinStep(String board, String hand) {
        int[] handCnt = new int[26];
        for (char c : hand.toCharArray()) handCnt[c - 'A']++;
        int res = dfs(board, handCnt);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    int dfs(String board, int[] hand) {
        board = clean(board);
        if (board.isEmpty()) return 0;
        String key = board + Arrays.toString(hand);
        if (memo.containsKey(key)) return memo.get(key);
        int res = Integer.MAX_VALUE;
        int i = 0;
        while (i < board.length()) {
            int j = i;
            while (j < board.length() && board.charAt(j) == board.charAt(i)) j++;
            char c = board.charAt(i);
            int need = 3 - (j - i);
            if (hand[c - 'A'] >= need) {
                hand[c - 'A'] -= need;
                int next = dfs(board.substring(0, i) + board.substring(j), hand);
                if (next != Integer.MAX_VALUE) res = Math.min(res, need + next);
                hand[c - 'A'] += need;
            }
            i = j;
        }
        return memo.put(key, res) == null ? res : res;
    }
    String clean(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < sb.length()) {
            int j = i;
            while (j < sb.length() && sb.charAt(j) == sb.charAt(i)) j++;
            if (j - i >= 3) { sb.delete(i, j); i = 0; } else i = j;
        }
        return sb.toString();
    }
}
