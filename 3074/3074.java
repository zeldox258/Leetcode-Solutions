class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        // Calculate the total number of apples
        int totalApples = 0;
        for (int count : apple) {
            totalApples += count;
        }

        // Sort the capacity array in descending order
        Arrays.sort(capacity);
        int boxesUsed = 0;
        int currentCapacity = 0;

        // Use a reverse loop to pick the largest boxes first
        for (int i = capacity.length - 1; i >= 0; i--) {
            currentCapacity += capacity[i];
            boxesUsed++;
            if (currentCapacity >= totalApples) {
                break;
            }
        }

        return boxesUsed;
    }
}