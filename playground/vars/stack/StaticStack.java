package vars.stack;

public class StaticStack<T> {
    private Object[] data;
    private int top;

    public StaticStack(int capacity) {
        data = new Object[capacity];
        top = -1;
    }

    public void push(T value) {
        data[++top] = value;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            T value = (T) data[top];
            data[top] = null;
            top--;
            return value;
        }
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
