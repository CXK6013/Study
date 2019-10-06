package com.cxk.tree;
import	java.util.Arrays;

/**
 * @author XingKe
 * @date 2019-08-10 18:09
 */
public class BinaryNodeDemo {
    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(8);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(1);
        TreeNode t7 = new TreeNode(7);
        BinaryTree root = new BinaryTree(t1);
        root.getRootNode().leftNode = t2;
        root.getRootNode().rightNode = t3;
        t2.leftNode = t4;
        t2.rightNode = t5;
        t3.leftNode = t6;
        t3.rightNode = t7;

        root.otherFrontShow(t1);
    }

}
