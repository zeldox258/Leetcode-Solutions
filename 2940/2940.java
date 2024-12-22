class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        final int n = heights.length;
        final int k = queries.length;
        int[] ans = new int[k];
        int[] stack = new int[n];
        List<Integer>[] newQueries = new ArrayList[n];
        int top = -1;

        for (int i = 0; i < n; ++i) {
            newQueries[i] = new ArrayList<>();
        }

        for (int i = 0; i < k; ++i) {
            int a = Math.min(queries[i][0], queries[i][1]);
            int b = Math.max(queries[i][0], queries[i][1]);

            if (a == b || heights[a] < heights[b]) {
                ans[i] = b;
                continue;
            }

            ans[i] = -1;
            newQueries[b].add(i);
        }

        for (int i = n - 1; i > - 1; --i) {
            while (top > -1 && heights[stack[top]] < heights[i]) {
                --top;
            }

            for (int j : newQueries[i]) {
                int target = heights[Math.min(queries[j][0], queries[j][1])];

                if (top == -1 || heights[stack[0]] < target) {
                    continue;
                }

                ans[j] = search(heights, stack, top, target);
            }

            stack[++top] = i;
        }

        return ans;
    }

    private int search(int[] heights, int[] stack, int top, int target) {
        int left = 0, right = top;

        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (heights[stack[mid]] > target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (heights[stack[right]] > target) {
            return stack[right];
        }

        if (heights[stack[left]] > target) {
            return stack[left];
        }

        return -1;
    }
}