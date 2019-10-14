package com.cxk.enumstudy;


/**
 * @author XingKe
 * @date 2019-10-11 19:04
 */
public enum EnumDemo{
    /**
     *
     */
    HIGH("星期一", 1),
    LOW("2", 3);

    String key;
    int value;

    EnumDemo(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
