
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[]words=text.split(" "); java.util.List<String> res=new java.util.ArrayList<>();
        for(int i=0;i+2<words.length;i++) if(words[i].equals(first)&&words[i+1].equals(second)) res.add(words[i+2]);
        return res.toArray(new String[0]);
    }
}
