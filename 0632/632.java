
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            pq.offer(new int[]{nums.get(i).get(0), i, 0});
            max = Math.max(max, nums.get(i).get(0));
        }
        int[] res = {pq.peek()[0], max};
        while (true) {
            int[] cur = pq.poll();
            int row = cur[1], col = cur[2];
            if (col + 1 >= nums.get(row).size()) break;
            int next = nums.get(row).get(col+1);
            pq.offer(new int[]{next, row, col+1});
            max = Math.max(max, next);
            int min = pq.peek()[0];
            if (max - min < res[1] - res[0]) res = new int[]{min, max};
        }
        return res;
    }
}
