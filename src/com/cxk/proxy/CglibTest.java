package com.cxk.proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author XingKe
 * @date 2019-06-05 11:12
 */
public class CglibTest {
    public static void main(String[] args) {
        DaoProxy daoProxy = new DaoProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallback(daoProxy);
        Dao dao = (Dao) enhancer.create();
        dao.select();
    }
}
