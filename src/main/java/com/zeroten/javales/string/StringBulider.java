/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： StringBulider.java
 * 模块说明：
 * 修改历史:
 * 2019-12-19 - cl- 创建。
 */

package com.zeroten.javales.string;

public class StringBulider {
    public static String trimAll(String str){
        StringBuilder sb=new StringBuilder();
        char[] chars=str.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            if(chars[i] == ' '){
                continue;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder();
        char[] chars=str.toCharArray();
        for (int i = chars.length-1; i >= 0; i--){
            sb.append(chars[i]);
        }
        return sb.toString();
    }


}
