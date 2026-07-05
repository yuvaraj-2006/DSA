class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        StringBuilder rootStr = new StringBuilder();
        StringBuilder subStr = new StringBuilder();

        serialize(root, rootStr);
        serialize(subRoot, subStr);

        return rootStr.toString().contains(subStr.toString());
    }

    private void serialize(TreeNode root, StringBuilder sb) {

        if (root == null) {
            sb.append(",#");
            return;
        }

        sb.append(",").append(root.val);

        serialize(root.left, sb);
        serialize(root.right, sb);
    }
}