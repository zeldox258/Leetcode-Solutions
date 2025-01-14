class Solution {
    Map<Integer, Integer> map;
    public int[] findFrequentTreeSum(TreeNode root) {
        map = new HashMap<>();

        dfs(root);
        int maxVal = Integer.MIN_VALUE;
        for (int freq : map.values()) {
            maxVal = Math.max(maxVal, freq);
        }

        List<Integer> max = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == maxVal) {
                max.add(key);
            }
        }
        return max.stream().mapToInt(Integer::intValue).toArray();

    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum= root.val+dfs(root.left)+dfs(root.right);

        map.put(sum, map.getOrDefault(sum,0)+1);

        return sum;
    }
}