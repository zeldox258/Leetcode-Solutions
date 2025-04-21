class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int maxTime = events[0][1]; 
        int result = events[0][0]; 

        for (int i = 1; i < events.length; i++) {
            int pressTime = events[i][1] - events[i - 1][1]; 
            if (pressTime > maxTime || (pressTime == maxTime && events[i][0] < result)) {
                maxTime = pressTime;
                result = events[i][0];
            }
        }

        return result;
    }
}