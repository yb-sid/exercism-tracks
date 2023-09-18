package com.ybsid.exercism.practice;

/**
 * <a href="https://exercism.org/tracks/java/exercises/linked-list">...</a>
 * @param <T>
 */
public class DoublyLinkedList<T> {
    private Element<T> head;
    private Element<T> tail;
    private int size = 0;
    void push(T value) {
        Element<T> node = new Element<>(value,null,null);
        if(size==0){
            head = node;
            tail = node;
        }else{
            node.prev = tail;
            tail.next = node;
            tail = tail.next;
        }
        size+=1;
    }
    T pop() {
        T poppedVal = tail.value;
        if(size>1){
            Element<T> beforeTail = tail.prev;
            beforeTail.next = null;
            tail = beforeTail;
        }else{
            head = null;
            tail = null;
        }
        size -=1 ;
        return poppedVal;
    }
    void unshift(T value) {
        Element<T> node = new Element<>(value , null , null);
        if(size==0){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head.prev = node;
            head = head.prev;
        }
        size +=1;
    }
    T shift() {
        T shifted = head.value;
        if(size>1){
            head = head.next;
            head.prev = null;
        }else{
            head = null;
            tail = null;
        }
        size-=1;
        return shifted;
    }
    private static final class Element<T> {
        private final T value;
        private Element<T> prev;
        private Element<T> next;
        Element(T value, Element<T> prev, Element<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
