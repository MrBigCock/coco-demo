package com.coco.demo.autobox;

/**
 * @see http://www.importnew.com/15712.html
 * @see http://www.cnblogs.com/liuling/archive/2013/05/05/intAndInteger.html
 * @author mvpzhao
 *
 */
public class AutoboxingTest {
    public static void main(String args[]) {
        // Example 1: == comparison pure primitive – no autoboxing
        int i1 = 1;
        int i2 = 1;
        System.out.println("i1==i2 : " + (i1 == i2)); // true

        // Example 2: equality operator mixing object and primitive
        Integer num1 = 2; // autoboxing
        int num2 = 2;
        System.out.println("num1 == num2 : " + (num1 == num2)); // true发生自动拆箱,Integer拆箱为int在和后者比

        // Example 3: special case - arises due to autoboxing in Java
        Integer obj1 = 1; // autoboxing will call Integer.valueOf()
        Integer obj2 = 1; // same call to Integer.valueOf() will return same
        // cached Object

        System.out.println("obj1 == obj2 : " + (obj1 == obj2)); // true

        // Example 4: equality operator - pure object comparison
        Integer one = new Integer(1); // no autoboxing
        Integer anotherOne = new Integer(1);
        System.out.println("one == anotherOne : " + (one == anotherOne)); // false
        
        Integer i5 = 128;//java在编译的时候,被翻译成-> Integer i5 = Integer.valueOf(127);
        Integer i6 = 128;
        System.out.println(i5 == i6);//true

    }
}
