package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> reverseQue = new PriorityQueue<>(Collections.reverseOrder());
        for (String k : firstList             ) {
            reverseQue.add(k);
        }
        for (String n : secondList             ) {
            reverseQue.add(n);
        }
        return reverseQue;
    }
}
