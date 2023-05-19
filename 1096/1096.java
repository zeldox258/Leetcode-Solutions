
class Solution {
    public java.util.List<String> braceExpansionII(String expression) {
        java.util.Set<String> res=new java.util.TreeSet<>(parse(expression,new int[]{0}));
        return new java.util.ArrayList<>(res);
    }
    java.util.Set<String> parse(String s,int[]i){
        java.util.Set<String> res=new java.util.HashSet<>(),cur=new java.util.HashSet<>(); cur.add("");
        while(i[0]<s.length()){char c=s.charAt(i[0]);if(c=='{'){i[0]++;java.util.Set<String> sub=parse(s,i);java.util.Set<String> next=new java.util.HashSet<>();for(String a:cur)for(String b:sub)next.add(a+b);cur=next;}else if(c=='}'){i[0]++;break;}else if(c==','){res.addAll(cur);cur=new java.util.HashSet<>();cur.add("");i[0]++;}else{java.util.Set<String> next=new java.util.HashSet<>();for(String a:cur)next.add(a+c);cur=next;i[0]++;}}
        res.addAll(cur); return res;
    }
}
