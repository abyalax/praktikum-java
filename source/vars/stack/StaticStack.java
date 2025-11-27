package vars.stack;

public class StaticStack<T> {
    private Object[] data;
    private int top;

    public StaticStack(int capacity) {
        top = -1;
        this.data = new Object[capacity];
    }

    public void push(T input) {
        data[++top] = input;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            T value = (T) data[top];
            data[top] = null; // manually remove reference to prevent memory leak
            top--;
            return value;
        }
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        return (T) data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.print("[ ");
            for (int i = top; i >= 0; i--) {
                System.out.print(data[i]);
                if (i > 0)
                    System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}