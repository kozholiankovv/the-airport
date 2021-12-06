package com.solvdeducation.airport.linkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedListTest {
    private static final Logger log = LogManager.getLogger(LinkedListTest.class.getName());
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("C");
        linkedList.addLast("D");
        linkedList.addFirst("B");
        linkedList.addFirst("A");
        log.error(linkedList);

    }
}
