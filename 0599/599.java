
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);
        List<String> res = new ArrayList<>();
        int minIdx = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = map.get(list2[i]) + i;
                if (sum < minIdx) { minIdx = sum; res.clear(); res.add(list2[i]); }
                else if (sum == minIdx) res.add(list2[i]);
            }
        }
        return res.toArray(new String[0]);
    }
}
