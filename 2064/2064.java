class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1, right = 100000;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isPossible(quantities, mid, n))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    private boolean isPossible(int[] quantities, int mid, int n) {
        int count = 0;
        for (int q : quantities) {
            count += (q + mid -1) / mid;
            if(count > n) return false;
        }
        return true;
    }
}