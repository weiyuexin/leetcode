package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _145二叉树的后序遍历
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/1 22:50
 */
public class _145二叉树的后序遍历 {
    public static void main(String[] args) {

    }
    // TODO 二叉树后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorder(root,ans);
        return ans;
    }
    public void postorder(TreeNode root,List<Integer> ans){
        if (root == null){
            return;
        }
        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.val);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
