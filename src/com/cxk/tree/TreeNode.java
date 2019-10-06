package com.cxk.tree;

/**
 * @author XingKe
 * @date 2019-08-03 22:37
 */
public class TreeNode {

     int data;
     TreeNode leftNode;
     TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }

    public void frontShow(){
        System.out.println(this.data);
        if (leftNode != null){
            this.leftNode.frontShow();
        }
        if (rightNode != null){
            this.rightNode.frontShow();
        }
    }
    public void frontShow(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(data);
        frontShow(root.leftNode);
        frontShow(root.rightNode);
    }
}
