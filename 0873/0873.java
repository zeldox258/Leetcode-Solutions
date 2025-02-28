class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length, maxLen = 0;
        Map<Integer, Integer> indexMap = new HashMap<>();
        Map<Integer, Integer> dp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int prevNum = arr[i] - arr[j];
                if (prevNum < arr[j] && indexMap.containsKey(prevNum))
                {
                    int k = indexMap.get(prevNum);
                    int len = dp.getOrDefault(k * n + j, 2) + 1;
                    dp.put(j * n + i, len);
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen >= 3 ? maxLen : 0;
    }
}