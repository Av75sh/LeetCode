import java.util.*;

class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 1, right = (long)1e18;
        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (can(mid, mountainHeight, workerTimes)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean can(long time, int height, int[] times) {
        long removed = 0;

        for (int t : times) {
            long l = 0, r = height;

            while (l <= r) {
                long m = (l + r) / 2;
                long cost = (long)t * m * (m + 1) / 2;

                if (cost <= time) l = m + 1;
                else r = m - 1;
            }

            removed += r;
            if (removed >= height) return true;
        }

        return removed >= height;
    }
}
