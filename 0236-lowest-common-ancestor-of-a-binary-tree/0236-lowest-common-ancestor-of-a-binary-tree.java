
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        boolean pLiesInLeft = exist(root.left, p);
        boolean qLiesInLeft = exist(root.left, q);
        if(pLiesInLeft && qLiesInLeft)
            return lowestCommonAncestor(root.left, p, q);
        else if(!pLiesInLeft && !qLiesInLeft)
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;
    }
    public boolean exist(TreeNode root, TreeNode target) {
        if(root == null) return false;
        if(root == target) return true;
        return exist(root.left, target) || exist(root.right, target);
    }
}
