package com.cxk.linklist;

/**
 * @author XingKe
 * @date 2019-04-25 14:04
 */
public class TestLoopNode {
    public static void main(String[] args) {
        LoopNode l1 = new LoopNode(1);
        LoopNode l2 = new LoopNode(2);
        LoopNode l3 = new LoopNode(3);

        l1.afterInsert(l2).afterInsert(l3);
        System.out.println(l1.getNext().getNext().getNext().getData());

    }
}
