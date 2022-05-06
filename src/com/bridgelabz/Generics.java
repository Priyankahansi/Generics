package com.bridgelabz;

public class Generics {


    //maximum integer number
    public void compareMax(Integer obj1, Integer obj2, Integer obj3) {
        if (obj1 > obj2 && obj1 > obj3)
            System.out.println(obj1 + " " + "is a maximum number");
        else if (obj2 > obj1 && obj2 > obj3)
            System.out.println(obj2 + " " + " is a maximum number");
        else
            System.out.println(obj3 + " " + "is a maximum number");
    }

    //maximum float number
    public void compareFloatMax(Float obj1, Float obj2, Float obj3) {
        if (obj1 > obj2 && obj1 > obj3)
            System.out.println(obj1 + " " + "is a maximum number");
        else if (obj2 > obj1 && obj2 > obj3)
            System.out.println(obj2 + " " + " is a maximum number");
        else
            System.out.println(obj3 + " " + "is a maximum number");
    }

    //Maximum string method
     public static String getLongestString(String[] array) {
          int maxLength = 0;
          String longestString = null;
          for (String s : array) {
               if (s.length() > maxLength) {
                    maxLength = s.length();
                    longestString = s;
               }
          }
          return longestString;
     }


     public static void main(String[] args) {
        Generics obj = new Generics();
        obj.compareMax(8, 9, 2);
        obj.compareFloatMax(1.0f, 2.0f, 3.0f);
          String[] fruits = {"Apple","peach"," bannana"};
          String longestString = getLongestString(fruits);
          System.out.format("longest string: '%s'\n", longestString);
    }
}


