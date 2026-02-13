package DSA.oop.oop3.encapsulation.accessControl;

import java.util.Arrays;

public class A {
    ///  Default access modifier -> if do not specify
    /// if different package it will not be able to allow.
    /// it the same package it will be able to allow.



    /**

     SET OF RULE OF ACCESS CONTROL-

     -------------------------------------------------------------------------------------------------
     Modifier     | Same Class | Same Package | Subclass (same pkg) | Subclass (diff pkg) | World
     -------------------------------------------------------------------------------------------------
     public       |     +      |      +       |         +           |         +           |   +
     -------------------------------------------------------------------------------------------------
     protected    |     +      |      +       |         +           |         +           |
     -------------------------------------------------------------------------------------------------
     (no modifier)|     +      |      +       |         +           |                     |
     (default)    |            |              |                     |                     |
     -------------------------------------------------------------------------------------------------
     private      |     +      |              |                     |                     |
     -------------------------------------------------------------------------------------------------


     */



    private int num; // it is made private can be only access in this class.
    String name;
    int[] arr;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
