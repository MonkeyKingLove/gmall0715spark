package com.atguigu.gmall0715.mock.util;

/**
 * @BelongsProject: gmall0715spark
 * @BelongsPackage: com.atguigu.gmall0715.mock.util
 * @Author: liangyu
 * @CreateTime: 2019-12-13 18:49
 * @Description: ${Description}
 */
public class RanOpt<T> {
    T value ;
    int weight;

    public RanOpt ( T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}
