class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int totalgas = 0, totalcost = 0, tank = 0;
        int n = gas.length;
        
        
        for(int i=0; i<n; i++){
            totalgas += gas[i];
            totalcost += cost[i];
            tank += gas[i] - cost[i];
        
        if(tank < 0){
            start = i+1;
            tank = 0;
        }
        }
        
        return (totalgas >= totalcost) ? start : -1;
    }
}