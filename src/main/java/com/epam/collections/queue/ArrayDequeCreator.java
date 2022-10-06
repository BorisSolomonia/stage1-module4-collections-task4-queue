package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> sumOfQue = new ArrayDeque<>();
        sumOfQue.add(firstQueue.poll());
        sumOfQue.add(firstQueue.poll());
        sumOfQue.add(secondQueue.poll());
        sumOfQue.add(secondQueue.poll());
        while (firstQueue.size() > 0 || secondQueue.size() > 0){
            firstQueue.add(sumOfQue.poll());
            sumOfQue.add(firstQueue.poll());
            sumOfQue.add(firstQueue.poll());
            secondQueue.add(sumOfQue.poll());
            sumOfQue.add(secondQueue.poll());
            sumOfQue.add(secondQueue.poll());
        }
        return sumOfQue;
    }
}
