
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        java.util.Arrays.sort(tokens); int lo=0,hi=tokens.length-1,score=0,res=0;
        while(lo<=hi){ if(power>=tokens[lo]){power-=tokens[lo++];score++;res=Math.max(res,score);} else if(score>0){power+=tokens[hi--];score--;} else break; }
        return res;
    }
}
