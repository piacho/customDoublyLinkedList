package programmingExercise.implementation;

//TODO check if I need to have these import - seems to be the same package.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmingExecise.implementation.LLG;

import static org.junit.jupiter.api.Assertions.*;


public class LLGTest {

    static LLG list;

    @BeforeEach
    public void setup() {
        list = new LLG();
    }

    @Test
    public void newListHasNoElementsWhenCreated() {
        assertEquals(0, list.size());
    }

    @Test
    public void isEmptyIndicatesNoElementsInTheList() {

        assertAll(
                () -> assertEquals(0, list.size()),
                () -> assertTrue(list.isEmpty())
        );
    }

    @Test
    public void newElementsCanBeAddedToTheList() {

        assertAll(
                () -> assertEquals(0, list.size()),
                () -> assertTrue(list.isEmpty())
        );

        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        assertAll(
                () -> assertEquals(3, list.size()),
                () -> assertFalse(list.isEmpty())
        );
    }

    @Test
    public void elementsCanBeRetirevedFromTheList() {

        assertTrue(list.isEmpty());
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        assertAll(

                () -> assertEquals(1, list.getElement()),
                () -> assertEquals(2, list.getElement()),
                () -> assertEquals(3, list.getElement())
        );
    }

    @Test
    public void llgListWorksWithMultipleDataTypes() {

        LLG list1 = new LLG();
        list.addElement(1);
        list.addElement(2);
        list1.addElement("a");
        list1.addElement("b");
        assertAll(
                () -> assertEquals(Integer.class, list.getElement().getClass()),
                () -> assertEquals(String.class, list1.getElement().getClass())
        );

    }


}
