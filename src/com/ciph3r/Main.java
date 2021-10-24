package com.ciph3r;

import com.ciph3r.collections.Customer;
import com.ciph3r.collections.EmailComparator;
import com.ciph3r.generics.*;
import com.ciph3r.oop.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //oopDemo();
        //genericsDemo();
        collectionsDemo();
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
        var items = new NonGenericList();
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

    public static void collectionsDemo() {
        List<Customer> customers = new ArrayList<>();
        var c1 = new Customer("a", "e2");
        var c2 = new Customer("c", "e3");
        var c3 = new Customer("b", "e1");

        Collections.addAll(customers, c1, c2 ,c3);

        System.out.println(customers);
        Collections.sort(customers);
        System.out.println(customers);
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}
