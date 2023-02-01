package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _94二叉树的中序遍历
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/1 22:24
 */
public class _94二叉树的中序遍历 {
    public static void main(String[] args) {

    }


    static List<Integer> list = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }
    public static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
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
