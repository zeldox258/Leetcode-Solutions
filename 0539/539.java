
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String[] parts = timePoints.get(i).split(":");
            minutes[i] = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }
        Arrays.sort(minutes);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < minutes.length; i++) min = Math.min(min, minutes[i] - minutes[i-1]);
        min = Math.min(min, 1440 - minutes[minutes.length-1] + minutes[0]);
        return min;
    }
}
