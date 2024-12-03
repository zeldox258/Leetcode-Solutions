class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder(s);
        for(int i=0; i<spaces.length;i++){
            res.insert(spaces[i] + i, ' ');
        }
        return res.toString();
    }
}