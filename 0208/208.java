class Trie {
    private Trie[] children=new Trie[26];
    private boolean end=false;
    public void insert(String word){Trie cur=this;for(char c:word.toCharArray()){int i=c-'a';if(cur.children[i]==null)cur.children[i]=new Trie();cur=cur.children[i];}cur.end=true;}
    public boolean search(String word){Trie cur=this;for(char c:word.toCharArray()){int i=c-'a';if(cur.children[i]==null)return false;cur=cur.children[i];}return cur.end;}
    public boolean startsWith(String prefix){Trie cur=this;for(char c:prefix.toCharArray()){int i=c-'a';if(cur.children[i]==null)return false;cur=cur.children[i];}return true;}
}