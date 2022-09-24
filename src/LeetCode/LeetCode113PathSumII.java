package LeetCode;

import javax.swing.tree.TreeNode;
import java.awt.*;
import java.util.ArrayList;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 24.09.2022_18:12
 */
//public class LeetCode113PathSumII {
//    public static void main(String[] args) {
//        int[] a = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
//    }
//
//    public static void helper(TreeNode root, int currSum, List<Integer> list, List<List<Integer>> res, int target) {
//        if (root == null) return;
//
//        list.add(root.val);
//        currSum += root.val;
//
//        if (root.left == null && root.right == null) {
//            if (currSum == target) {
//                res.add(new ArrayList<>(list));
//                list.remove(list.size() - 1);
//                return;
//            }
//        }
//        helper(root.left, currSum, list, res, target);
//        helper(root.right, currSum, list, res, target);
//        list.remove(list.size() - 1);
//
//    }
//
//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//        List<List<Integer>> res = new ArrayList<>();
//        helper(root, 0, new ArrayList<>(), res, targetSum);
//        return res;
//
//    }
//}
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}