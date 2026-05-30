import java.util.*;

class Solution {

    static class FenwickTree {
        int[] bit;

        FenwickTree(int n) {
            bit = new int[n + 2];
        }

        void update(int idx, int val) {
            idx++;
            while (idx < bit.length) {
                bit[idx] = Math.max(bit[idx], val);
                idx += idx & -idx;
            }
        }

        int query(int idx) {
            idx++;
            int res = 0;
            while (idx > 0) {
                res = Math.max(res, bit[idx]);
                idx -= idx & -idx;
            }
            return res;
        }
    }

    public List<Boolean> getResults(int[][] queries) {

        int maxPos = 0;
        for (int[] q : queries) {
            maxPos = Math.max(maxPos, q[1]);
        }

        int limit = maxPos + 1;

        TreeSet<Integer> obstacles = new TreeSet<>();
        obstacles.add(0);
        obstacles.add(limit);

        for (int[] q : queries) {
            if (q[0] == 1) {
                obstacles.add(q[1]);
            }
        }

        FenwickTree bit = new FenwickTree(limit + 2);

        Integer prev = null;
        for (int x : obstacles) {
            if (prev != null) {
                bit.update(x, x - prev);
            }
            prev = x;
        }

        List<Boolean> ans = new ArrayList<>();

        for (int i = queries.length - 1; i >= 0; i--) {
            int[] q = queries[i];

            if (q[0] == 1) {
                int x = q[1];

                Integer left = obstacles.lower(x);
                Integer right = obstacles.higher(x);

                if (left != null && right != null) {
                    bit.update(right, right - left);
                }

                obstacles.remove(x);

            } else {
                int x = q[1];
                int sz = q[2];

                Integer next = obstacles.higher(x);

                if (next == null) {
                    next = obstacles.last();
                }

                Integer prevObs = obstacles.lower(next);

                int bestGap = bit.query(prevObs);
                int tailGap = x - prevObs;

                ans.add(Math.max(bestGap, tailGap) >= sz);
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}