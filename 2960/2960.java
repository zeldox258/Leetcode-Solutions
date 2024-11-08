class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int testeddevice=0;
        for(int i=0;i<batteryPercentages.length;i++){
            if(batteryPercentages[i]-testeddevice>0)
            testeddevice++;
        }
        return testeddevice;
    }
}