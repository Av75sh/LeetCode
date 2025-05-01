import java.util.*;

public class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int low = 0, high = Math.min(tasks.length, workers.length);
        while (low < high) {
            int mid = (low + high + 1) / 2;
            if (canAssign(tasks, workers, pills, strength, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private boolean canAssign(int[] tasks, int[] workers, int pills, int strength, int k) {
        TreeMap<Integer, Integer> taskMap = new TreeMap<>();
        for (int i = 0; i < k; i++) {
            taskMap.put(tasks[i], taskMap.getOrDefault(tasks[i], 0) + 1);
        }

        int i = workers.length - k;
        for (; i < workers.length; i++) {
            Integer key = taskMap.floorKey(workers[i]);
            if (key != null) {
                remove(taskMap, key);
                continue;
            }
            if (pills == 0) return false;
            key = taskMap.floorKey(workers[i] + strength);
            if (key == null) return false;
            pills--;
            remove(taskMap, key);
        }
        return true;
    }

    private void remove(TreeMap<Integer, Integer> map, int key) {
        if (map.get(key) == 1) {
            map.remove(key);
        } else {
            map.put(key, map.get(key) - 1);
        }
    }
}
