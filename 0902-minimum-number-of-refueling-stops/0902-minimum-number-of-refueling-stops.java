class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int current = startFuel;
        int count = 0;
        int i = 0;
        int n = stations.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        while (current < target) {
            while (i < n && stations[i][0] <= current) {
                pq.offer(stations[i][1]);
                i++;
            }

            if (pq.isEmpty()) return -1;

            current += pq.poll();
            count++;
        }
        return count;
    }
}
