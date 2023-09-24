package org.bioproj.lcadl;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListToTreeNode {
    public static TreeNode convertToTree(List<Integer> list) {
        return convertToTree(list, 0, list.size() - 1);
    }

    private static TreeNode convertToTree(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = convertToTree(list, start, mid - 1);
        root.right = convertToTree(list, mid + 1, end);

        return root;
    }
    public static TreeNode fillTree(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(list.get(0));
        queue.offer(root);

        int i = 1; // list 索引

        while (i < list.size()) {
            TreeNode currNode = queue.poll();

            // 填充左子节点
            if (i < list.size()) {
                Integer leftVal = list.get(i++);
                if (leftVal != null) {
                    currNode.left = new TreeNode(leftVal);
                    queue.offer(currNode.left);
                }
            }

            // 填充右子节点
            if (i < list.size()) {
                Integer rightVal = list.get(i++);
                if (rightVal != null) {
                    currNode.right = new TreeNode(rightVal);
                    queue.offer(currNode.right);
                }
            }
        }

        return root;
    }
}
