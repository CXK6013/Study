package com.cxk.headlinklist;

/**
 * @author XingKe
 * @date 2019-04-25 20:42
 */
public class TestLinkList {
    public static void main(String[] args) {
        Node<Integer> header = new Node<>();
        LinkList<Integer> linkList = new LinkList<>(1);
        linkList.add(2);
        linkList.add(3);
        System.out.println(linkList.getHeader().getNext().getNext().getData());
    }
}
