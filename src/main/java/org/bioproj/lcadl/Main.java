package org.bioproj.lcadl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root == null){
            return null;
        }

        int left = height(root.left);
        int right = height(root.right);
        if(left == right){
            return root;
        }else if(left > right){
            return lcaDeepestLeaves(root.left);
        }else{
            return lcaDeepestLeaves(root.right);
        }
    }

    private static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,5,1,6,2,0,8,null,null,7,4));
//        TreeNode root = ListToTreeNode.convertToTree(list);
        TreeNode treeNode = ListToTreeNode.fillTree(list);
        TreeNode result = lcaDeepestLeaves(treeNode);

        System.out.println(treeNode);

    }

}
