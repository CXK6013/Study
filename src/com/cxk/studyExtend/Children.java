package com.cxk.studyExtend;

/**
 * @author XingKe
 * @date 2019-07-21 11:04
 */
public class Children extends Person {
      private int kk;

    /**
     * 对于私有类型变量不能被继承的解释
     * 对于父类的私有变量,子类无法通过this关键字直接访问.
     * 而是只能通过继承的get和set方法来间接的去访问，还有super
     */
    public   Children(){
          super(20,"dd");
          this.kk = 20;
      }
    public static void main(String[] args) {
            Children p = new Children();
             System.out.println(p.getAge());
    }
    @Override
    public String toString() {
        return "Children{" +
                "kk=" + kk +
                '}'+getName();
    }
}
