package com.ross;

import java.util.LinkedList;
import java.util.Stack;

public class MyStack {
    LinkedList<String> letters = new LinkedList<String>();

    MyStack() {

        letters = new LinkedList<String>();

    }
    String peek() {
        return letters.peek();

    }
    String pop() {
return letters.pop();
    }
    String push() {
         letters.push("f");


        return "f";
    }
    boolean empty(){

if (letters.isEmpty()) {
    return true;
}
else {
    return false;
}
    }
}

