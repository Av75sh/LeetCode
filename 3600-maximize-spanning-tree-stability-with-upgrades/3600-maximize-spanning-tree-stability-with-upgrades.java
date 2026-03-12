import java.util.*;

class Solution {
    class DSU {
        int[] p, r;
        DSU(int n) {
            p = new int[n];
            r = new int[n];
            for (int i = 0; i < n; i++) p[i] = i;
        }
        int find(int x) {
            if (p[x] != x) p[x] = find(p[x]);
            return p[x];
        }
        boolean union(int a, int b) {
            int pa = find(a), pb = find(b);
            if (pa == pb) return false;
            if (r[pa] < r[pb]) p[pa] = pb;
            else if (r[pb] < r[pa]) p[pb] = pa;
            else {
                p[pb] = pa;
                r[pa]++;
            }
            return true;
        }
    }

    public int maxStability(int n, int[][] edges, int k) {
        int l = 0, r = 200000, ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (check(n, edges, k, mid)) {
                ans = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        return ans;
    }

    boolean check(int n, int[][] edges, int k, int target) {
        DSU dsu = new DSU(n);
        int upgrades = 0;

        for (int[] e : edges) {
            if (e[3] == 1) {
                if (e[2] < target) return false;
                if (!dsu.union(e[0], e[1])) return false;
            }
        }

        List<int[]> opt = new ArrayList<>();
        for (int[] e : edges) if (e[3] == 0) opt.add(e);

        opt.sort((a, b) -> b[2] - a[2]);

        for (int[] e : opt) {
            if (dsu.find(e[0]) == dsu.find(e[1])) continue;
            if (e[2] >= target) {
                dsu.union(e[0], e[1]);
            } else if (e[2] * 2 >= target && upgrades < k) {
                upgrades++;
                dsu.union(e[0], e[1]);
            }
        }

        int root = dsu.find(0);
        for (int i = 1; i < n; i++) if (dsu.find(i) != root) return false;
        return true;
    }
}
