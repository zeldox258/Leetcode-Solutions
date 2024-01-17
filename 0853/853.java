
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Integer[] idx = new Integer[n]; for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> position[b] - position[a]);
        int fleets = 0; double lastTime = 0;
        for (int i : idx) {
            double t = (double)(target - position[i]) / speed[i];
            if (t > lastTime) { fleets++; lastTime = t; }
        }
        return fleets;
    }
}
