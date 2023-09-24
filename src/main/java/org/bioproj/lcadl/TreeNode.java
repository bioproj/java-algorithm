package org.bioproj.lcadl;

import lombok.Data;

@Data
public class TreeNode {
    private int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
}
