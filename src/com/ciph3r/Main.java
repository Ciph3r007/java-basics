package com.ciph3r;

import com.ciph3r.generics.*;
import com.ciph3r.oop.*;

public class Main {
    public static void main(String[] args) {
        //oopDemo();
        genericsDemo();
    }

    public static void oopDemo() {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        var point3 = new Point(1, 3);
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point3));


        var textbox = new TextBox();
        textbox.setText("Call me box");
        System.out.println(textbox);

        UIControl[] controls = { new TextBox(), new CheckBox() };
        for (var control : controls)
            control.render();
    }

    public static void genericsDemo(){
        // Using object class for list
        var items = new List();
        items.add("some string");
        items.add(123);
        items.add(new User(10));

        /* Problems:
         * Needs explicit casting to assign
         * Throws error on wrong cast
         */
        int item = (int) items.get(1);
        System.out.println("Non-generic list with object class");
        System.out.println(item);

        // Using generic list
        // Needs wrappers for primitives; i.e. int -> Integer (Called boxing)
        var users = new GenericList<User>();
        users.add(new User(20));
        users.add(new User(10));
        users.add(new Instructor(30));

        System.out.println("\nGeneric List");
        for(User user:users){
            System.out.println(user);
        }

        // Using generic method
        System.out.println("\nGeneric methods in non-generic class");
        System.out.println(Utils.max(users.get(0), users.get(2)));
        Utils.print("userCount", 3);
    }
}
