
package com.dhw.test;

import java.util.Calendar;

public class MyString {
    public static void main(String[] args) {
        String s = "liming";
        System.out.println(s);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        System.out.println(cal);
    }
}
