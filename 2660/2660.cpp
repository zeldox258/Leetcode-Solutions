class Solution {
public:
    int helper(vector<int>& arr){
        int n=arr.size();
        int sum=0;
        for(int i=0;i<n;i++){
            if(i==0)sum+=arr[i];
            else if(i==1){
                if(arr[i-1]==10)sum+=(2*arr[i]);
                else sum+=arr[i];
            }
            else{
                if(arr[i-1]==10 || arr[i-2]==10)sum+=(2*arr[i]);
                else sum+=arr[i];
            }
        }
        return sum;
    }
    int isWinner(vector<int>& player1, vector<int>& player2) {
        if(helper(player1)>helper(player2))return 1;
        else if(helper(player1)<helper(player2))return 2;
        return 0;
    }
};