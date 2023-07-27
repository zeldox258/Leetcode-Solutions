
class Solution {
    public boolean[] camelMatch(String[] queries, String pattern) {
        boolean[]res=new boolean[queries.length];
        for(int i=0;i<queries.length;i++) res[i]=match(queries[i],pattern);
        return res;
    }
    boolean match(String q,String p){int j=0;for(char c:q.toCharArray()){if(j<p.length()&&c==p.charAt(j))j++;else if(Character.isUpperCase(c))return false;}return j==p.length();}
}
