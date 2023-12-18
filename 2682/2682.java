class Solution {
    public int[] circularGameLosers(int n, int k) {

        Set<Integer> vis = new HashSet<>();
        int i = 0, rem = 0;
        
        while(true) {
            rem = (rem + k * i++) % n;
            if (!vis.add(rem)) break; //rem has been visited
        }

        int j = 0, res[] = new int[n - vis.size()];

        for (i = 0; i < n; i++) {
            if (!vis.contains(i)) res[j++] = i + 1;
        }

        return res;

    }
}