class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        if (s1.length > s2.length) {
            String[] temp = s1;
            s1 = s2;
            s2 = temp;
        }

        int i = 0, j = 0;
        while (i < s1.length && s1[i].equals(s2[i])) { // for prefix
            i++;
        }
        while (j < s1.length && s1[s1.length - 1 - j].equals(s2[s2.length - 1 - j])) { //for suffix
            j++;
        }
        return i + j >= s1.length;
    }
}