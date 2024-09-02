package daniils.lesson11;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayDequeShowcase {

    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque<String>();

        deque.add("Red");
        deque.add("Blue");
        deque.add("Black");

        String[] strings = {"White", "Purple"};

        //deque.addAll(List.of(strings));
        //Collections.addAll(deque, strings);

        //Queue methods
        deque.peek();
        deque.poll();
        deque.pop();
        deque.element();
        deque.offer("White");

        //Deque methods
        deque.peekLast();
        deque.pollLast();
        deque.offerLast("Purple");

        //offer
        ArrayDeque limitedDeque = new ArrayDeque<String>(2);
        limitedDeque.add("Black");
        limitedDeque.add("Blue");
        limitedDeque.add("White");
        limitedDeque.add("Brown");


        System.out.println(deque);

    }

//    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(2);
//
//        try {
//            queue.add(1);
//            queue.add(2);
//            queue.add(3);
//        } catch (IllegalStateException e) {
//            System.out.println("Exception using add: " + e.getMessage());
//        }
//
//        queue.clear();
//
//        if (queue.offer(1)) {
//            System.out.println("1 added successfully using offer.");
//        }
//        if (queue.offer(2)) {
//            System.out.println("2 added successfully using offer.");
//        }
//        if (!queue.offer(3)) {
//            System.out.println("Offer failed for 3: Queue is full.");
//        }
//    }

}
