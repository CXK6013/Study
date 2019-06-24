
package com.cxk.aboutstatic;



import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * @author XingKe
 * @date 2019-04-26 21:11
 */
class  Sington {
    public static  Sington sington = new Sington();
    public static int count1;
    public static  int count2 = 0;

    public Sington() {
        count1++;
        count2++;
    }
    public  static  Sington getInstance(){
        return  sington;
    }
}
public class Singtons {
    public static void main(String[] args) {
        Sington sington = Sington.getInstance();
        System.out.println("count1"+sington.count1);
        System.out.println("count2"+sington.count2);
        System.out.println("测试汉字");
        List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
        for(GarbageCollectorMXBean b : l) {
            System.out.println(b.getName());
        }
    }
}

