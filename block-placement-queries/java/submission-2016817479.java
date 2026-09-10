class Solution {

    class SegTree {
        int n;
        int[] tree;

        SegTree(int n) {
            this.n = n;
            tree = new int[4 * n];
        }

        void update(int node, int l, int r, int idx, int val) {
            if (l == r) {
                tree[node] = val;
                return;
            }

            int mid = (l + r) >> 1;

            if (idx <= mid)
                update(node * 2, l, mid, idx, val);
            else
                update(node * 2 + 1, mid + 1, r, idx, val);

            tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
        }

        int query(int node, int l, int r, int ql, int qr) {
            if (ql > r || qr < l) return 0;

            if (ql <= l && r <= qr)
                return tree[node];

            int mid = (l + r) >> 1;

            return Math.max(
                    query(node * 2, l, mid, ql, qr),
                    query(node * 2 + 1, mid + 1, r, ql, qr)
            );
        }
    }

    public List<Boolean> getResults(int[][] queries) {

        int maxX = 0;

        for (int[] q : queries) {
            maxX = Math.max(maxX, q[1]);
        }

        TreeSet<Integer> obstacles = new TreeSet<>();
        obstacles.add(0);

        for (int[] q : queries) {
            if (q[0] == 1) {
                obstacles.add(q[1]);
            }
        }

        SegTree seg = new SegTree(maxX + 2);

        for (int x : obstacles) {
            Integer prev = obstacles.lower(x);

            if (prev != null) {
                seg.update(1, 0, maxX + 1, x, x - prev);
            }
        }

        List<Boolean> answer = new ArrayList<>();

        for (int i = queries.length - 1; i >= 0; i--) {

            int[] q = queries[i];

            if (q[0] == 2) {

                int x = q[1];
                int sz = q[2];

                Integer last = obstacles.floor(x);

                int best = seg.query(
                        1,
                        0,
                        maxX + 1,
                        0,
                        last == null ? 0 : last
                );

                int tail = x - (last == null ? 0 : last);

                answer.add(Math.max(best, tail) >= sz);

            } else {

                int x = q[1];

                Integer prev = obstacles.lower(x);
                Integer next = obstacles.higher(x);

                obstacles.remove(x);

                if (next != null) {
                    seg.update(
                            1,
                            0,
                            maxX + 1,
                            next,
                            next - prev
                    );
                }
            }
        }

        Collections.reverse(answer);

        return answer;
    }
}