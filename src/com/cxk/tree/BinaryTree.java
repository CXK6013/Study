package com.cxk.tree;

import java.util.Stack;

/**
 * @author XingKe
 * @date 2019-08-10 17:13
 */
public class BinaryTree {

    TreeNode root;
    Stack<TreeNode> stackOne = new Stack<>();
    Stack<TreeNode> stackTwo = new Stack<>();
    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public BinaryTree() {
    }

    public TreeNode getRootNode(){
        return root;
    }

    /**
     * 前序遍历
     */
    public void frontShow(){
        System.out.println(root.data);
        if (root.leftNode != null){
            root.leftNode.frontShow();
        }
        if (root.rightNode != null){
            root.rightNode.frontShow();
        }
    }

    public  void otherFrontShow(TreeNode root){

       /* if (root == null) {
            return;
        }*/
        //先将整颗左子树压入栈中,这里的遍历思想是有问题的,现在就开始压栈
        //这里处理左子树为空
        /*while (root != null){
            System.out.println(root.data);
            if (root.rightNode != null){
                stackOne.push(root.rightNode);
            }
            root = root.leftNode;
        }
        while(!stackOne.isEmpty()){
            otherFrontShow(stackOne.pop());
        }*/
        while(root != null || !stackOne.isEmpty()){
            if (root != null){
                System.out.println(root.data);
                stackOne.push(root);
                root = root.leftNode;
            }else{
                root = stackOne.pop();
                root = root.rightNode;
            }

        }
    }
    /**
     * 中序遍历
     */
    public void middleShow(){

    }
    /**
     * 后序遍历
     */
    public void afterShow(){


    }
}
