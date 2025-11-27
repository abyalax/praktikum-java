package vars.stack;

import vars.array.Arrays;

public class DynamicStack<T> {
    private Arrays<T> data;
    private int top;

    public DynamicStack() {
        top = -1;
        data = new Arrays<T>();
    }

    public void push(T input) {
        data.add(input);
        top++;
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

    public T peek() {
        return (T) data.get(top);
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
            data.printStack();
        }
    }
}
