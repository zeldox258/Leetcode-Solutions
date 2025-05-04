class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int ans = 0;

        for(int i = 0; i < f.length; i++) {
            for(int j = 0; j < b.length; j++) {
                if(f[i] <= b[j]){
                    b[j] = 0;
                    ans++;
                    break;
                }
            }
        }
        return f.length - ans;
    }
}