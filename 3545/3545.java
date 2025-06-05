class Solution {
    public int minDeletion(String s, int k) {
        int[] charSet = new int[26];
        for(char c : s.toCharArray()) {
            charSet[c - 'a']++;
        }

        int numOfDistinctChars = 0;
        for(int i : charSet) {
            if(i > 0) numOfDistinctChars++;
        }

        int distinctCharsToDelete = numOfDistinctChars - k;
        if(distinctCharsToDelete == 0) return distinctCharsToDelete;
        
        Arrays.sort(charSet);

        int minDeletion = 0, index = 0;
        while(distinctCharsToDelete > 0) {
            if(charSet[index] > 0) {
                minDeletion += charSet[index];
                distinctCharsToDelete--;
            }
            index++;
        }

        return minDeletion;
    }
}