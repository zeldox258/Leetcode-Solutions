
class StreamChecker {
    class TrieNode{TrieNode[]children=new TrieNode[26];boolean isEnd;}
    TrieNode root=new TrieNode(); java.util.List<TrieNode> nodes=new java.util.ArrayList<>();
    public StreamChecker(String[] words){for(String w:words){TrieNode cur=root;for(int i=w.length()-1;i>=0;i--){char c=w.charAt(i);if(cur.children[c-'a']==null)cur.children[c-'a']=new TrieNode();cur=cur.children[c-'a'];}cur.isEnd=true;}}
    public boolean query(char letter){java.util.List<TrieNode> newNodes=new java.util.ArrayList<>();newNodes.add(root);boolean res=false;for(TrieNode node:nodes){TrieNode next=node.children[letter-'a'];if(next!=null){newNodes.add(next);if(next.isEnd)res=true;}}nodes=newNodes;if(root.children[letter-'a']!=null&&root.children[letter-'a'].isEnd)res=true;return res;}
}
