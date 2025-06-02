class Solution {
    public int maxFreqSum(String s) {
        int maxConst = 0;
        int maxVowel = 0;
        String vowel = "aeiou";

        char arr[] = new char[26];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;

            if(vowel.indexOf(s.charAt(i)) == -1){
                maxConst = Math.max(maxConst, arr[s.charAt(i) - 'a']);
            }else{
                maxVowel = Math.max(maxVowel, arr[s.charAt(i) - 'a']);
            }
        }
        return maxConst+maxVowel;
    }
}