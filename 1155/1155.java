class Solution {

    int MOD = 1000000000 + 7;

    Map<String, Integer> memo = new HashMap<>();

    public int numRollsToTarget(int d, int f, int target) {

        if (d == 0 && target == 0) {

            return 1;

        }

        if (d == 0 || target == 0) {

            return 0;

        }

        String str = d + " " + target;

        if (memo.containsKey(str)) {

            return memo.get(str);

        }

        int res = 0;

        for (int i = 1; i <= f; i++) {

            if (target >= i) {

                res = (res + numRollsToTarget(d - 1, f, target - i)) % MOD;

            } else {

                break;

            }

        }

        memo.put(str, res);

        return res;

    }

}
        
