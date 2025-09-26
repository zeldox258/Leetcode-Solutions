class Solution {
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        int min=Integer.MAX_VALUE,i1=-1,i2=-1;
        for(int i=0;i<wordsDict.length;i++){
            if(wordsDict[i].equals(word1)){if(word1.equals(word2)){if(i2!=-1)min=Math.min(min,i-i2);i2=i;}else{i1=i;}}
            else if(wordsDict[i].equals(word2)) i2=i;
            if(i1!=-1&&i2!=-1)min=Math.min(min,Math.abs(i1-i2));
        }
        return min;
    }
}