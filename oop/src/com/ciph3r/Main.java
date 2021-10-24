package com.ciph3r;

public class Main {

    public static void main(String[] args) {
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
}
