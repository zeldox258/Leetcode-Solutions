class Solution {
    int[][] trie=new int[100001][26];
    boolean[] end=new boolean[100001];
    int idx=0;
    public void insert(String w){
        int p=0;
        for(char c:w.toCharArray()){
            int i=c-'a';
            if(trie[p][i]==0) trie[p][i]=++idx;
            p=trie[p][i];
        }
        end[p]=true;
    }
    public boolean search(String w){
        int p=0;
        for(char c:w.toCharArray()){
            int i=c-'a';
            if(trie[p][i]==0) return false;
            p=trie[p][i];
        }
        return end[p];
    }
}