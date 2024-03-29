package com.greg.customdoublylinkedlist.list.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListImplTest {

    private DoublyDoublyDoublyLinkedListImpl list;

    @BeforeEach
    public void setup() {
        list = new DoublyDoublyDoublyLinkedListImpl();
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
    public void newElementsCanBeAddedToTheEndOfTheList() {

        list.addElementEnd(1);
        list.addElementEnd(2);
        list.addElementEnd(3);

        assertAll(
                () -> assertEquals(3, list.size()),
                () -> assertFalse(list.isEmpty())
        );
    }

    @Test
    public void newElementsCanBeAddedToTheFrontOfTheList() {

        list.addElementFront(1);
        list.addElementFront(2);
        list.addElementFront(3);

        assertAll(
                () -> assertEquals(3, list.size()),
                () -> assertFalse(list.isEmpty())
        );
    }

    @Test
    public void elementsAddedToEndCanBeRetrievedFromTheListInACorrectOrder() {

        list.addElementEnd(1);
        list.addElementEnd(2);
        list.addElementEnd(3);
        list.addElementEnd(4);
        list.addElementEnd(5);

        assertAll(

                () -> assertEquals(1, list.getElement()),
                () -> assertEquals(2, list.getElement()),
                () -> assertEquals(3, list.getElement()),
                () -> assertEquals(4, list.getElement()),
                () -> assertEquals(5, list.getElement())
        );
    }

    @Test
    public void elementsAddedToFrontCanBeRetrievedFromTheListInACorrectOrder() {

        list.addElementFront(1);
        list.addElementFront(2);
        list.addElementFront(3);
        list.addElementFront(4);
        list.addElementFront(5);

        assertAll(

                () -> assertEquals(5, list.getElement()),
                () -> assertEquals(4, list.getElement()),
                () -> assertEquals(3, list.getElement()),
                () -> assertEquals(2, list.getElement()),
                () -> assertEquals(1, list.getElement())
        );
    }

    @Test
    public void elementsRetrievedFromListAreDeleted() {

        DoublyDoublyDoublyLinkedListImpl<String> list1 = new DoublyDoublyDoublyLinkedListImpl<>();

        String[] data = {"a", "b", "c", "d", "e", "f"};

        for (String dPoint : data) {
            list.addElementEnd(dPoint);
            list1.addElementFront(dPoint);
        }

        assertAll(
                () -> assertFalse(list.isEmpty()),
                () -> assertFalse(list1.isEmpty()),
                () -> assertEquals(6, list.size()),
                () -> assertEquals(6, list1.size())
        );

        for (int i = 0; i < 2; i++) {
            list.getElement();
            list1.getElement();
        }

        assertAll(
                () -> assertFalse(list.isEmpty()),
                () -> assertEquals(4, list.size()),
                () -> assertFalse(list1.isEmpty()),
                () -> assertEquals(4, list1.size())
        );

        for (int i = 0; i < 4; i++) {
            list.getElement();
            list1.getElement();
        }

        assertAll(
                () -> assertTrue(list.isEmpty()),
                () -> assertEquals(0, list.size()),
                () -> assertTrue(list1.isEmpty()),
                () -> assertEquals(0, list1.size())
        );
    }

    @Test
    public void listWorksWithMultipleDataTypes() {

        list.addElementEnd(1);
        list.addElementFront("a");
        list.addElementEnd(3l);
        list.addElementFront(12.5d);
        list.addElementEnd(9.87f);

        assertAll(
                () -> assertEquals(Double.class, list.getElement().getClass()),
                () -> assertEquals(String.class, list.getElement().getClass()),
                () -> assertEquals(Integer.class, list.getElement().getClass()),
                () -> assertEquals(Long.class, list.getElement().getClass()),
                () -> assertEquals(Float.class, list.getElement().getClass())
        );
    }
}
