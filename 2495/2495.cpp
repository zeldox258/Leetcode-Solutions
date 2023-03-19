class Solution {
public:
    bool numberOfSubarraysHavingEvenPro(string s) {
        stack<char> st;
        for(char c:s){
            if(c=='('||c=='['||c=='{') st.push(c);
            else{
                if(st.empty()) return false;
                char p=st.top();st.pop();
                if(c==')'&&p!='('||c==']'&&p!='['||c=='}'&&p!='{') return false;
            }
        }
        return st.empty();
    }
};