import java.util.*;
class Solution {
    public String alienOrder(String[] words) {
        Map<Character,Set<Character>> graph=new LinkedHashMap<>();
        Map<Character,Integer> indegree=new HashMap<>();
        for(String w:words)for(char c:w.toCharArray()){graph.putIfAbsent(c,new HashSet<>());indegree.putIfAbsent(c,0);}
        for(int i=0;i<words.length-1;i++){
            String a=words[i],b=words[i+1];int len=Math.min(a.length(),b.length());
            if(a.length()>b.length()&&a.startsWith(b)) return "";
            for(int j=0;j<len;j++){if(a.charAt(j)!=b.charAt(j)){if(!graph.get(a.charAt(j)).contains(b.charAt(j))){graph.get(a.charAt(j)).add(b.charAt(j));indegree.merge(b.charAt(j),1,Integer::sum);}break;}}
        }
        Queue<Character> q=new LinkedList<>();for(char c:indegree.keySet())if(indegree.get(c)==0)q.offer(c);
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty()){char c=q.poll();sb.append(c);for(char nb:graph.get(c)){if(indegree.merge(nb,-1,Integer::sum)==0)q.offer(nb);}}
        return sb.length()==indegree.size()?sb.toString():"";
    }
}