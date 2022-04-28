package datastructures.stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(7);
        stack.push(23);
        stack.push(3);
        stack.push(11);
        stack.pop();

        stack.getTop();
        stack.getHeight();
        stack.printStack();
    }
}
