package com.atguigu.gmall0715.mock.util;

import java.util.Random;

/**
 * @BelongsProject: gmall0715spark
 * @BelongsPackage: com.atguigu.gmall0715.mock.util
 * @Author: liangyu
 * @CreateTime: 2019-12-13 18:51
 * @Description: ${Description}
 */
public class RandomNum {
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}
