package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: leetcode.problems
 * @ProjectName: leetcode
 * @ClassName: _144二叉树的前序遍历
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/1 22:45
 */
public class _144二叉树的前序遍历 {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }
    // TODO 二叉树前序遍历
    public void preorder(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
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


