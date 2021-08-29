package com.ross;

public class Main {



    public static void main(String[] args) {
        int num = (5+4); num = num / 9; num=9;
        System.out.println(num);

        MyStack m = new MyStack();

        m.letters.add("A");
        m.letters.add("b");
        m.letters.add("c");
        m.letters.add("d");
        m.letters.add("e");
        System.out.println(m.letters);
        String peak = m.peek();
        String pop = m.pop();
        String push = m.push();
        boolean empty = m.empty();


      //  System.out.println("The letter in top is " + peak);

        System.out.println("popped letter: " + pop);
        System.out.println(m.letters);
        System.out.println("new added word: " + push);

        System.out.println("is the Stack empty? " + empty);



    }
}
