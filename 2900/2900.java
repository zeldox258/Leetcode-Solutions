class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int l = groups.length;
        int i=1;
        List<String> arrAns = new ArrayList<>();
        arrAns.add(words[0]);
        while(i< l){
            if(groups[i] != groups[i-1])
            arrAns.add(words[i]);
            i++;
        }
        return arrAns;
    }
}