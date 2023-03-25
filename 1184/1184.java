
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination){int t=start;start=destination;destination=t;}
        int total=0,partial=0;
        for(int i=0;i<distance.length;i++){
            total+=distance[i];
            if(i>=start&&i<destination) partial+=distance[i];
        }
        return Math.min(partial,total-partial);
    }
}
