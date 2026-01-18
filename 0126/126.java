import java.util.*;
class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict=new HashSet<>(wordList);
        List<List<String>> res=new ArrayList<>();
        if(!dict.contains(endWord)) return res;
        Map<String,List<String>> children=new HashMap<>();
        Map<String,Integer> dist=new HashMap<>();
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);dist.put(beginWord,0);
        boolean found=false;
        while(!q.isEmpty()&&!found){
            int size=q.size();
            for(int i=0;i<size;i++){
                String word=q.poll();
                char[] arr=word.toCharArray();
                for(int j=0;j<arr.length;j++){
                    char orig=arr[j];
                    for(char c='a';c<='z';c++){
                        arr[j]=c;String next=new String(arr);
                        if(!dict.contains(next)) continue;
                        if(!dist.containsKey(next)){dist.put(next,dist.get(word)+1);q.offer(next);}
                        if(dist.get(next)==dist.get(word)+1){children.computeIfAbsent(word,x->new ArrayList<>()).add(next);}
                        if(next.equals(endWord)) found=true;
                    }
                    arr[j]=orig;
                }
            }
        }
        dfs(beginWord,endWord,children,new ArrayList<>(Arrays.asList(beginWord)),res);
        return res;
    }
    void dfs(String word,String end,Map<String,List<String>> children,List<String> path,List<List<String>> res){
        if(word.equals(end)){res.add(new ArrayList<>(path));return;}
        if(!children.containsKey(word)) return;
        for(String next:children.get(word)){path.add(next);dfs(next,end,children,path,res);path.remove(path.size()-1);}
    }
}