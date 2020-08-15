package programmingExercise.implementation.utils;

import org.junit.jupiter.api.Test;
import programmingExecise.implementation.utils.Node;

import static org.junit.jupiter.api.Assertions.*;


public class NodeTest {

    private static final int testDataI = 123;
    private static final int testDataI1 = 1234;

    private static final String testDataS = "text";
    private static final String testDataS1 = "texts";


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
    public void dataIsSuccessfullyReadFromNodes() {
        Node<Integer> nodeI = new Node<>(testDataI);
        Node<Integer> nextNodeI = new Node<>(testDataI1);

        Node<String> nodeS = new Node<>(testDataS);
        Node<String> nextNodeS = new Node<>(testDataS1);

        nodeI.setNextNode(nextNodeI);
        nodeS.setNextNode(nextNodeS);
        assertEquals(testDataI1, nodeI.getNextNode().getData());
        assertAll(
                () -> assertEquals(testDataI1, nodeI.getNextNode().getData()),
                () -> assertEquals(testDataS1, nodeS.getNextNode().getData())
        );
    }


}
