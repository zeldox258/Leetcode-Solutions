class Solution {
    public static int candy(int[] ratings) {
        int n = ratings.length;
        int i = 1;
        int cnt = 1;

        while(i < n) {
            if(ratings[i] == ratings[i-1]) {
                cnt++;
                i++;
                continue;
            }

            int peak = 1;
            while(i < n && ratings[i-1] < ratings[i]) {
                peak++;
                cnt += peak;
                i++;
            }
            int down = 1;
            while(i < n && ratings[i-1] > ratings[i]) {
                cnt += down;
                down++;
                i++;
            }
            if(down > peak)
                cnt += down - peak;
        }
        return cnt;
    }
}