package com.mangxiao.common.componet.demo;

import org.apache.commons.codec.digest.DigestUtils;

public class Spliter {
    public static void main(String[] args){
        int[] ids = {1,2,3,4,3,5,6,3,7,8};
        float threshold = 0.2f;
        for (int id : ids){
            String digest = DigestUtils.md5Hex(String.valueOf(id).getBytes());
            int hashCode = digest.hashCode();
            long round = Math.abs(hashCode) % 100; // 取模方式

            int random = (int) (Math.random() * 100); // 2.随机数方式
            if (round < threshold * 100){
                System.out.println("小于阈值:"+ round);
            }else{
                System.out.println("大于阈值:"+ round);
            }

        }
    }
}
