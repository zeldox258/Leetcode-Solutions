class Solution {
public:
    int newUsersDailyCount(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),[](auto& a,auto& b){return a[1]<b[1];});
        int count=1,end=intervals[0][1];
        for(int i=1;i<intervals.size();i++){
            if(intervals[i][0]>=end){count++;end=intervals[i][1];}
        }
        return count;
    }
};