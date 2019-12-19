/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： StringTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-19 - cl- 创建。
 */

package com.zeroten.javales.string;

import org.testng.annotations.Test;

public class StringTest {
    @Test
    public void test字符串内存使用() {
        String str1="hello";
        String str2="hello";
        System.out.println("str1 == str1:"+(str1 == str2));

        String str3="helloworld";
        String str4=str1 + "world";
        System.out.println("str3 == str4:"+(str3 == str4));

        String str5=new String("hello");
        String str6=new String("hello");
        System.out.println("str5 == str6:"+(str5 == str6));

        String str7=str6.intern();
        System.out.println("str1 == str7:"+(str1 == str7));

        String str8=new String("hello").intern();
        System.out.println("str1 == str8:"+(str1 == str8));

        String str9="hello";
        str9+="world";
        System.out.println("str3 == str9:"+(str3 == str9));
    }

    @Test
    public void testLength(){
        String str = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str);
        System.out.println("length is: " + str.length());
        System.out.println("code point count is: " +
                str.codePointCount(0, str.length()));
    }

    @Test
    public void testSubstring(){
        String str = "hello, world!";
        System.out.println(str.substring(1));
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(0, str.length() - 1));
//        System.out.println(str.substring(0, str.length() + 1));
    }
    @Test
    public void testMerge(){
        String str1="hello"+"world";
        str1+="."+"2019";
        System.out.println(str1);
    }
    @Test
    public void testFormat(){
        System.out.printf("hello, %s %n", "world");
        System.out.printf("⼤写a：%c %n", 'A');
        System.out.printf("100 > 50：%b %n", 100 > 50);
        System.out.printf("100除以2：%d %n", 100 / 2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("100元打8.5折扣是：%f 元%n", 50 * 0.85);
        System.out.printf("上述价格的16进制数是：%a %n", 50 * 0.85);
        System.out.printf("上⾯的折扣是%d%% %n", 85);
    }

    @Test
    public void testIsequals(){
        String str1="HELLO";
        String str2="hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    @Test
    public void testJu(){
        String str1="hello";
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.startsWith("ho"));
        System.out.println(str1.startsWith(" h"));
        System.out.println(str1.startsWith("o"));

        System.out.println(str1.endsWith("o"));

    }
    @Test
    public void testFind(){
//        String str = "hello, world!";
//        System.out.println(str.indexOf("e"));
//        System.out.println(str.indexOf('e'));
//        System.out.println(str.indexOf(101));
//        System.out.println(str.indexOf("e", 2));
//        System.out.println(str.indexOf("l"));
//
//        System.out.println(str.lastIndexOf("l"));
//        System.out.println(str.lastIndexOf("l", 9));

        String str1="hello, world. today is 2019-12-10.say hi to me";
        int index =0;
        do {
            int at1=str1.indexOf("o",index+1);
            if(index == -1){
                break;
            }
            index = at1;
            System.out.println(String.format("第 %d 位是小写字母o:",at1+1));

        }while (true);

    }

    @Test
    public void testReplace(){
        System.out.println("hello, world!".replace('o', 'A'));
        System.out.println("hello, world!".replace("o", "OOO"));
        System.out.println("hello, world!".replaceAll("o", "OOO"));
    }
    @Test
    public void testTrim(){
        System.out.println("hello,world".trim());
    }
    @Test
    public void testToCase(){
        System.out.println("Hello,World！".toUpperCase());
        System.out.println("Hello,World！".toLowerCase());

    }

    @Test
    public void testString创建(){
        String str1 = "hello" + " world" + "!";
        System.out.println(str1);

        StringBuffer strB1 = new StringBuffer();
        strB1.append("hello");
        strB1.append(" world");
        strB1.append("!");
        System.out.println(strB1.toString());

        StringBuilder strB2 = new StringBuilder();
        strB2.append("hello");
        strB2.append(" world");
        strB2.append("!");
        System.out.println(strB2.toString());

        System.out.println("strB2 length is " + strB2.length());

        strB2.setLength(strB2.length() - 1);
        System.out.println(strB2.toString());

        strB2.setLength(strB2.length() + 10);
        System.out.println(strB2.toString());

    }
}
