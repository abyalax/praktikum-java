import vars.stack.StaticStack;

public class Main {
    public static void main(String[] args) {

        // Arrays<Integer> arrData = new Arrays<Integer>(4);

        // arrData.add(1);
        // arrData.add(2);
        // arrData.add(3);
        // arrData.add(4);
        // arrData.add(5);
        // arrData.add(6);

        // System.out.println(arrData.get(0));
        // arrData.print();

        // SingleLinkedList<Integer> linkedList = new SingleLinkedList<Integer>();

        // linkedList.addLast(1);
        // linkedList.addLast(2);
        // linkedList.addLast(3);

        // linkedList.printList();

        // DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();

        // doubleLinkedList.addLast(1);
        // doubleLinkedList.addLast(2);
        // doubleLinkedList.addLast(3);
        // doubleLinkedList.addLast(4);

        // doubleLinkedList.printForward();
        // doubleLinkedList.printBackward();

        StaticStack<Integer> stack = new StaticStack<Integer>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();

    }
}