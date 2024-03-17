class Solution {
public:
    vector<int> parent;
    int find(int x){return parent[x]==x?x:parent[x]=find(parent[x]);}
    int happyStudents(int n, vector<vector<int>>& edges) {
        parent.resize(n);
        iota(parent.begin(),parent.end(),0);
        int comp=n;
        for(auto& e:edges){
            int a=find(e[0]),b=find(e[1]);
            if(a!=b){parent[a]=b;comp--;}
        }
        return comp;
    }
};