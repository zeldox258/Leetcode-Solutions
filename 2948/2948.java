

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;


        class Pair {
            int index, value;
            Pair(int index, int value) {
                this.index = index;
                this.value = value;
            }
        }

        Pair[] pairs = new Pair[n];
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(i, nums[i]);
        }


        Arrays.sort(pairs, (a, b) -> a.value - b.value);


        Pair[] ids = Arrays.copyOf(pairs, n);

        int i = 0;
        while (i < n) {
            int j = i;
            i++;

            while (i < n && pairs[i].value - pairs[i - 1].value <= limit) {
                i++;
            }

            Arrays.sort(ids, j, i, (a, b) -> a.index - b.index);

            for (int k = j; k < i; k++) {
                ans[ids[k].index] = pairs[k].value;
            }
        }

        return ans;
    }
}