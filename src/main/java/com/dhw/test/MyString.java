
package com.dhw.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MyString {
    public static void main(String[] args) {
        String s = "liming";
        System.out.println(s);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        System.out.println(cal);

        StringBuilder sb = new StringBuilder();
        List list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            sb.append(i);
            list.add(sb);
        }
        System.out.println(list.toArray().toString());
    }
}
