package com.cxk.linklist;

import java.util.LinkedList;

/**
 * @author XingKe
 * @date 2019-04-25 11:26
 */
public class Test {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.append(n2).append(n3);
        n1.insertNode(new Node(5));
        System.out.println(n1.getNext().getData());
    }
}
