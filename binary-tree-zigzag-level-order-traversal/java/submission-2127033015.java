class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.offer(root);

        boolean leftToRight = true;

        while (!nodesQueue.isEmpty()) {

            int size = nodesQueue.size();
            List<Integer> row = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = nodesQueue.poll();

                if (leftToRight) {
                    row.add(node.val);
                } else {
                    row.add(0, node.val);
                }

                if (node.left != null) {
                    nodesQueue.offer(node.left);
                }

                if (node.right != null) {
                    nodesQueue.offer(node.right);
                }
            }

            result.add(row);
            leftToRight = !leftToRight;
        }

        return result;
    }
}