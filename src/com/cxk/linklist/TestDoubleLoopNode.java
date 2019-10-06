package com.cxk.linklist;

/**
 * @author XingKe
 * @date 2019-04-25 16:19
 * 测试双向循环链表
 */
public class TestDoubleLoopNode {
    public static void main(String[] args) {
        DoubleLoopNode d1 = new DoubleLoopNode(1);
        DoubleLoopNode d2 = new DoubleLoopNode(2);
        DoubleLoopNode d3 = new DoubleLoopNode(3);
        d1.after(d2);
        d2.after(d3);
        System.out.println(d1.getNext().getData());
    }
}
