package com.company;

import javax.swing.tree.TreeNode;

//操作给定的二叉树，将其变换为源二叉树的镜像。
public class MirrorTest {
    public void Mirror(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left != null) Mirror(root.left);
        if(root.right != null) Mirror(root.right);
    }
}
