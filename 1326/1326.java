class Solution {
    public boolean solve1326(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{') st.push(c);
            else{
                if(st.isEmpty()) return false;
                char p=st.pop();
                if(c==')'&&p!='('||c==']'&&p!='['||c=='}'&&p!='{') return false;
            }
        }
        return st.isEmpty();
    }
}