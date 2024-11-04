class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        char ch = word.charAt(0);
        int c = 1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==ch && c<9){
                c++;
            }else{
                comp.append(c).append(ch);
                ch=word.charAt(i);
                c=1;
            }
        }
        comp.append(c).append(ch);
        return comp.toString();
    }
}