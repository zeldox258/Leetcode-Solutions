class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] array = sentence.split(" ");

        for(int i =0;i<array.length;i++){
            if(searchWord.length() <=array[i].length() && searchWord.charAt(0) == array[i].charAt(0)){
                for(int j =0;j<array[i].length();j++){
                    if(j == searchWord.length()-1 && searchWord.charAt(j) == array[i].charAt(j)) return i+1;
                    if(searchWord.charAt(j) != array[i].charAt(j)) break;
                }
            }
        }

    return -1;
    }
}