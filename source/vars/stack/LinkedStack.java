package vars.stack;

import vars.linkedlist.SingleLinkedList;

public class LinkedStack<T> {
    private SingleLinkedList<T> data;
    private int top;

    public LinkedStack() {
        data = new SingleLinkedList<T>();
        top = -1;
    }

    public void push(T input) {
        data.addFirst(input);
        top++;
    }

    public T peek() {
        return (T) data.peek();
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            top--;
            return data.pop();
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            data.printList();
        }
    }
}
