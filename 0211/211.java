class WordDictionary {
    private WordDictionary[] children=new WordDictionary[26];
    private boolean end=false;
    public void addWord(String word){WordDictionary cur=this;for(char c:word.toCharArray()){int i=c-'a';if(cur.children[i]==null)cur.children[i]=new WordDictionary();cur=cur.children[i];}cur.end=true;}
    public boolean search(String word){return dfs(word,0,this);}
    boolean dfs(String word,int idx,WordDictionary node){
        if(idx==word.length()) return node.end;
        char c=word.charAt(idx);
        if(c=='.'){for(WordDictionary child:node.children) if(child!=null&&dfs(word,idx+1,child)) return true;return false;}
        int i=c-'a';return node.children[i]!=null&&dfs(word,idx+1,node.children[i]);
    }
}