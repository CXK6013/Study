package com.cxk.headlinklist;

/**
 * @author XingKe
 * @date 2019-04-26 16:11
 */
public class TestLinkLists {
    public static void main(String[] args) {
        LinkLists<Integer> linkLists = new LinkLists<>(1);
        linkLists.add(3);
        linkLists.add(2);
        System.out.println(linkLists);
    }
}
