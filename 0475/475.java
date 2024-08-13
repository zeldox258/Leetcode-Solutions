
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        for (int house : houses) {
            int pos = Arrays.binarySearch(heaters, house);
            if (pos < 0) pos = -(pos + 1);
            int dist = Integer.MAX_VALUE;
            if (pos < heaters.length) dist = Math.min(dist, heaters[pos] - house);
            if (pos > 0) dist = Math.min(dist, house - heaters[pos - 1]);
            radius = Math.max(radius, dist);
        }
        return radius;
    }
}
