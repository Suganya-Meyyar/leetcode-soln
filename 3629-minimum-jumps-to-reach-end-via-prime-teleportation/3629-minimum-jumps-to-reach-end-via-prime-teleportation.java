class Solution {
    public int minJumps(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return 0;

        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            for (int p = 2; p * p <= val; p++) {
                if (val % p == 0) {
                    map.computeIfAbsent(p, k -> new ArrayList<>()).add(i);
                    while (val % p == 0)
                        val /= p;
                }
            }
            if (val > 1) {
                map.computeIfAbsent(val, k -> new ArrayList<>()).add(i);
            }
        }
        q.offer(0);
        visited[0] = true;
        int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int idx = q.poll();
                if (idx == n - 1)
                    return steps;

                if (idx - 1 >= 0 && !visited[idx - 1]) {
                    visited[idx - 1] = true;
                    q.offer(idx - 1);
                }

                if (idx + 1 < n && !visited[idx + 1]) {
                    visited[idx + 1] = true;
                    q.offer(idx + 1);
                }
                int value = nums[idx];

                if (isPrime(value) && map.containsKey(value)) {
                    for (int next : map.get(value)) {
                        if (!visited[next]) {
                            visited[next] = true;
                            q.offer(next);
                        }
                    }
                    map.remove(value);
                }
            }
            steps++;
        }
        return -1;
    }
    private boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;
        }
        return true;
    }
}