package com.ciph3r.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// List extends Collection
// Uses index

public class ListDemo {
  public static void show() {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");

    // Add an item at a given index
    list.add(0, "!");

    // Add multiple items in one go
    Collections.addAll(list, "a", "b", "c");

    var first = list.get(0);
    list.set(0, "!!");

    list.remove(0);

    var index = list.indexOf("a");
    var lastIndex = list.lastIndexOf("a");

    System.out.println(list.subList(0, 2));
  }
}
