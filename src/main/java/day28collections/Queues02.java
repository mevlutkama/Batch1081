package day28collections;

import java.util.Deque;
import java.util.LinkedList;

public class Queues02 {

    /*
            Deque's are for storing multiple non-primitive data in the same data type
            Deque means "Double Ended Queue", it works successfully in FIFO and LIFO operations
     */
    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>();
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");

        /*
        Pushes an element onto the stack represented by this deque (in other words, at the head of this deque)
        if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
        This method is equivalent to addFirst.
        Params:
        e – the element to push
        Throws:
        IllegalStateException – if the element cannot be added at this time due to capacity restrictions
        ClassCastException – if the class of the specified element prevents it from being added to this deque
        NullPointerException – if the specified element is null and this deque does not permit null elements
        IllegalArgumentException – if some property of the specified element prevents it from being added to this deque
         */
        furnitureTruck.push("TV Unit");
        System.out.println(furnitureTruck);

        /*
        Pops an element from the stack represented by this deque.
        In other words, removes and returns the first element of this deque.
        This method is equivalent to removeFirst().
        Returns: the element at the front of this deque (which is the top of the stack represented by this deque)
        Throws:
        NoSuchElementException – if this deque is empty
         */
        String el9 = furnitureTruck.pop();
        System.out.println(el9);
        System.out.println(furnitureTruck);

        furnitureTruck.removeLastOccurrence("Bed");
        System.out.println(furnitureTruck);// [Chair, Mirror, Sofa, Bed, Bed, Dining Table]

        furnitureTruck.removeLast();
        System.out.println(furnitureTruck);// [Chair, Mirror, Sofa, Bed, Bed]

        /*
        Queue Class
        Unlike the stack class, this class works with first-in, first-out logic, except for special cases.
        FIFO (first in first out)
        The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. It follows FIFO concept.
        The Java Queue supports all methods of Collection interface including insertion, deletion, etc.
        LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
        If any null operation is performed on BlockingQueues, NullPointerException is thrown.
        The Queues which are available in java.util package are Unbounded Queues.
        The Queues which are available in java.util.concurrent package are the Bounded Queues.
        All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively.
        The Deques support element insertion and removal at both ends.

        Queue Methods:
        add(element): Adds the element given in the parameter to the queue. It throws an error if the operation fails.
        offer(element): Adds the element given in the parameter to the queue. Returns null if the operation fails.
        poll(): Removes the element at the beginning of the queue from the queue.
        peek(): It is used to reach the next element in the queue.
         */


    }
}
