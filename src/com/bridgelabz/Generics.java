package com.bridgelabz;

public class Generics {

    public void compareMax(Integer obj1, Integer obj2, Integer obj3) {
        if (obj1 > obj2 && obj1 > obj3)
            System.out.println(obj1 + " " + "is a maximum number");
        else if (obj2 > obj1 && obj2 > obj3)
            System.out.println(obj2 + " " + " is a maximum number");
        else
            System.out.println(obj3 + " " + "is a maximum number");
    }

    public void compareFloatMax(Float obj1, Float obj2, Float obj3) {
        if (obj1 > obj2 && obj1 > obj3)
            System.out.println(obj1 + " " + "is a maximum number");
        else if (obj2 > obj1 && obj2 > obj3)
            System.out.println(obj2 + " " + " is a maximum number");
        else
            System.out.println(obj3 + " " + "is a maximum number");
    }


    public static void main(String[] args) {
        Generics obj = new Generics();
        obj.compareMax(8, 9, 2);
        obj.compareFloatMax(1.0f, 2.0f, 3.0f);
    }
}


