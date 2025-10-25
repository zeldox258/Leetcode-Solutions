import java.util.*;
class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        // Build trie
        int[][] trie=new int[1][26];int[]end=new int[]{-1};int[]cnt=new int[]{1};
        int[] wordId=new int[words.length];
        for(int w=0;w<words.length;w++){
            int cur=0;
            for(char c:words[w].toCharArray()){int i=c-'a';if(trie[cur][i]==0){trie=java.util.Arrays.copyOf(trie,trie.length+1);trie[trie.length-1]=new int[26];trie[cur][i]=trie.length-1;}cur=trie[cur][i];}
            wordId[w]=cur;
        }
        Set<String> res=new HashSet<>();
        // DFS - simplified without custom trie, use map instead
        TrieNode root=new TrieNode();for(int w=0;w<words.length;w++){TrieNode cur=root;for(char c:words[w].toCharArray()){cur=cur.children.computeIfAbsent(c,x->new TrieNode());}cur.word=words[w];}
        for(int i=0;i<board.length;i++) for(int j=0;j<board[0].length;j++) dfs(board,i,j,root,res);
        return new ArrayList<>(res);
    }
    void dfs(char[][] b,int i,int j,TrieNode node,Set<String> res){
        if(i<0||i>=b.length||j<0||j>=b[0].length||b[i][j]=='#') return;
        char c=b[i][j];if(!node.children.containsKey(c)) return;
        TrieNode next=node.children.get(c);if(next.word!=null) res.add(next.word);
        b[i][j]='#';dfs(b,i+1,j,next,res);dfs(b,i-1,j,next,res);dfs(b,i,j+1,next,res);dfs(b,i,j-1,next,res);b[i][j]=c;
    }
    class TrieNode{Map<Character,TrieNode> children=new HashMap<>();String word=null;}
}