package com.aniket.java.strings;

public class StringsEx1 {
    public static void main(String[] args) {
        String s = "abc";
        s = s + "xyz";
        System.out.println(s);

        String s1 = "pqr";
        String s2 = "pqr";
        String s3 = new String("pqr");
        //they are doing reference comparison using s1==s3, so the value is not equal
        if (s1 == s3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        StringBuilder sb = new StringBuilder("my first string,");
        sb.append(" my second string,");
        sb.append(" my third string.");
        String str = sb.toString();
        System.out.println(str);

        String str1 = "abc";
        String str2 = "AbC";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        if (str1.compareTo(str2) > 0) {
            System.out.println("str1 > str2");
        } else if (str2.compareTo(str1) > 0) {
            System.out.println("str2 > str1");
        } else {
            System.out.println("str1 = str2");
        }

    }
}
