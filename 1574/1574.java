class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int endIdx = n - 1;

        while (endIdx > 0 && arr[endIdx] >= arr[endIdx - 1]) {
            endIdx--;
        }

        if (endIdx == 0) {
            return 0;
        }

        int minLengthToRemove = endIdx;

        int startIdx = 0;

        while (startIdx < endIdx && (startIdx == 0 || arr[startIdx - 1] <= arr[startIdx])) {
            while (endIdx < n && arr[startIdx] > arr[endIdx]) {
                endIdx++;
            }

            minLengthToRemove = Math.min(minLengthToRemove, endIdx - startIdx - 1);
            startIdx++;
        }

        return minLengthToRemove;
    }
}