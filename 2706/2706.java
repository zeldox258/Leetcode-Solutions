class Solution {
    public int buyChoco(int[] prices, int money) {
        int s1 = 101;
        int s2 = 101;
        for (int i : prices) {
            if (s1 > i) {
                s2 = s1;
                s1 = i;
            } else if (s2 >= i){
                s2 = i;
            }
        }
        return (s1+s2 <= money) ? money - (s1 + s2) : money;
    }
}