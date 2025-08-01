package Collections;

import java.util.ArrayList;

public class Array_List1 {
    
    class MyarrayList {
        public double area(int r) {
            final double pi = 3.142;
            return pi * r * r;
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> li = new ArrayList<>();
        li.add(10);         // Integer
        li.add(10.45d);     // Double
        li.add(15.25f);     // Float

        // Check if a string exists
        boolean found = li.contains("my name is shivaprasad");
        System.out.println("Contains check: " + found);

        System.out.println("Array list contains: " + li);

        Array_List1 outer = new Array_List1(); // create outer class instance

        for (int i = 0; i < li.size(); i++) {
            Object obj = li.get(i);
            int r = 0;

            if (obj instanceof Integer) {
                r = (Integer) obj;
            } else if (obj instanceof Double) {
                r = ((Double) obj).intValue(); // convert Double to int
            } else if (obj instanceof Float) {
                r = ((Float) obj).intValue(); // convert Float to int
            } else {
                System.out.println("Unsupported type at index " + i);
                continue;
            }

            double area = outer.new MyarrayList().area(r);
            System.out.println("Area of circle with radius " + r + " is " + area);
        }
    }
}
