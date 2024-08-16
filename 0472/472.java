
class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        for (String word : words) {
            int n = word.length();
            boolean[] dp = new boolean[n + 1];
            dp[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = (i == n ? 1 : 0); j < i; j++) {
                    if (dp[j] && wordSet.contains(word.substring(j, i))) {
                        dp[i] = true; break;
                    }
                }
            }
            if (dp[n]) result.add(word);
        }
        return result;
    }
}
