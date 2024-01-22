
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        TreeMap<Integer, Integer> cnt = new TreeMap<>();
        for (int h : hand) cnt.put(h, cnt.getOrDefault(h, 0) + 1);
        while (!cnt.isEmpty()) {
            int first = cnt.firstKey();
            for (int i = 0; i < groupSize; i++) {
                int k = first + i;
                if (!cnt.containsKey(k)) return false;
                int c = cnt.get(k);
                if (c == 1) cnt.remove(k); else cnt.put(k, c - 1);
            }
        }
        return true;
    }
}
