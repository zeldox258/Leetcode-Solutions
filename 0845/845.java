
class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length, res = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                int l = i - 1, r = i + 1;
                while (l > 0 && arr[l-1] < arr[l]) l--;
                while (r < n - 1 && arr[r+1] < arr[r]) r++;
                res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }
}
