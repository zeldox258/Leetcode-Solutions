class Solution {
    public long gridGame(int[][] grid) {
        long firstRowRem =0;
        long secRowRem = 0;
        long minRobo2Sum =Long.MAX_VALUE;

        for(long num : grid[0]){
            firstRowRem +=num;
        }

        for(int Robo1Col =0; Robo1Col< grid[0].length ; Robo1Col++){
            firstRowRem -=grid[0][Robo1Col];
            minRobo2Sum = Math.min(minRobo2Sum, Math.max(firstRowRem,secRowRem));
            secRowRem +=grid[1][Robo1Col];
        }

        return minRobo2Sum;

    }
}