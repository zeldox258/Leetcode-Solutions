
class Solution {
    public String[] expand(String s) {
        java.util.List<java.util.List<Character>> groups=new java.util.ArrayList<>();
        int i=0;
        while(i<s.length()){java.util.List<Character> group=new java.util.ArrayList<>();if(s.charAt(i)=='{'){i++;while(s.charAt(i)!='}'){if(s.charAt(i)!=',')group.add(s.charAt(i));i++;}i++;}else{group.add(s.charAt(i++));}java.util.Collections.sort(group);groups.add(group);}
        java.util.List<String> res=new java.util.ArrayList<>(); backtrack(groups,0,new StringBuilder(),res);
        return res.toArray(new String[0]);
    }
    void backtrack(java.util.List<java.util.List<Character>>g,int i,StringBuilder sb,java.util.List<String>res){if(i==g.size()){res.add(sb.toString());return;}for(char c:g.get(i)){sb.append(c);backtrack(g,i+1,sb,res);sb.deleteCharAt(sb.length()-1);}}
}
