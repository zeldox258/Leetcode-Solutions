class Solution {
    public String findLatestTime(String s) {
        char[] timeArray = s.toCharArray();
        
        if (timeArray[0] == '?') timeArray[0] = (timeArray[1] == '?' || timeArray[1] < '2') ? '1' : '0';
        
        if (timeArray[1] == '?') timeArray[1] = (timeArray[0] == '1') ? '1' : '9';
        
        if (timeArray[3] == '?') timeArray[3] = '5';
        
        if (timeArray[4] == '?') timeArray[4] = '9';
        
        return new String(timeArray);
    }
}