package com.greg.customdoublylinkedlist.list.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {

    private static final int testDataI = 123;
    private static final int testDataI1 = 1234;
    private static final int testDataI2 = 12345;

    private static final String testDataS = "text";
    private static final String testDataS1 = "texts";
    private static final String testDataS2 = "textsx";

    @Test
    public void nodeIsCreatedSuccessfullyAndCanHoldMultipleDataTypes() {

        Node<Integer> nodeI = new Node<>(testDataI);
        Node<String> nodeS = new Node<>(testDataS);

        assertAll(
                () -> assertEquals(testDataI, nodeI.getData()),
                () -> assertEquals(testDataS, nodeS.getData())
        );
    }

    @Test
    public void nextNodeIsNullByDefault() {

        Node<Integer> nodeI = new Node<>(testDataI);
        Node<String> nodeS = new Node<>(testDataS);

        assertAll(
                () -> assertNull(nodeI.getNextNode()),
                () -> assertNull(nodeS.getNextNode())
        );
    }

    @Test
    public void previousNodeIsNullByDefault() {

        Node<Integer> nodeI = new Node<>(testDataI);
        Node<String> nodeS = new Node<>(testDataS);

        assertAll(
                () -> assertNull(nodeI.getPreviousNode()),
                () -> assertNull(nodeS.getPreviousNode())
        );
    }

    @Test
    public void dataIsSuccessfullyReadFromNodes() {

        Node<Integer> nodeI = new Node<>(testDataI);
        Node<Integer> nextNodeI = new Node<>(testDataI1);
        Node<Integer> previousNodeI = new Node<>(testDataI2);

        Node<String> nodeS = new Node<>(testDataS);
        Node<String> nextNodeS = new Node<>(testDataS1);
        Node<String> previousNodeS = new Node<>(testDataS2);

        nodeI.setNextNode(nextNodeI);
        nodeI.setPreviousNode(previousNodeI);

        nodeS.setNextNode(nextNodeS);
        nodeS.setPreviousNode(previousNodeS);

        assertAll(
                () -> assertEquals(testDataI1, nodeI.getNextNode().getData()),
                () -> assertEquals(testDataI2, nodeI.getPreviousNode().getData()),
                () -> assertEquals(testDataS1, nodeS.getNextNode().getData()),
                () -> assertEquals(testDataS2, nodeS.getPreviousNode().getData())
        );
    }
}
