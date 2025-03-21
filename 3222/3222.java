class Solution {
    public String winningPlayer(int x, int y) {
        int player = 1;
        while(x >= 1 && y >= 4)
        {
            player = player == 1 ? 2 : 1;
            x -= 1;
            y-=4;
        }
        return player == 1 ? "Bob" : "Alice";
    }
}