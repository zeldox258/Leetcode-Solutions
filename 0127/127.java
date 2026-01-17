import java.util.*;
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict=new HashSet<>(wordList);
        if(!dict.contains(endWord)) return 0;
        Queue<String> q=new LinkedList<>();q.offer(beginWord);
        int steps=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String word=q.poll();char[] arr=word.toCharArray();
                for(int j=0;j<arr.length;j++){char orig=arr[j];
                    for(char c='a';c<='z';c++){arr[j]=c;String next=new String(arr);
                        if(next.equals(endWord)) return steps+1;
                        if(dict.remove(next)) q.offer(next);}arr[j]=orig;}
            }
            steps++;
        }
        return 0;
    }
}