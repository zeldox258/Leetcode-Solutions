
class Solution {
    public int[] findPermutation(String s) {
        int n = s.length() + 1;
        int[] res = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        int idx = 0;
        for (int i = 0; i < n; i++) {
            stack.push(i + 1);
            if (i == n - 1 || s.charAt(i) == 'I')
                while (!stack.isEmpty()) res[idx++] = stack.pop();
        }
        return res;
    }
}
