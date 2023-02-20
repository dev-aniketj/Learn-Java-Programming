package com.aniket.java.problems;


class StackException extends Exception {
    public StackException(String reason) {
        super(reason);
    }
}

class Stack {
    private int arr[];
    private int top, size;

    private static final int DEFAULT_SIZE = 5;

    public Stack() {
        initailize(DEFAULT_SIZE);
    }

    public Stack(int size) {
        initailize(size);
    }

    private void initailize(int size) {
        arr = new int[size];
        top = -1;
        this.size = size;
    }

    public void push(Integer element) throws StackException {
        if (top != size - 1) {
            arr[++top] = element;
        } else
            throw new StackException("Stack Overflow");
    }

    public void pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack Underflow");
        } else {
            arr[top--] = 0;
        }
    }

    public void peek() {
        if (isEmpty()) {
            return;
        }
        System.out.println("Top Most Element : " + arr[top]);
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public void print() {
        System.out.println("Print Stack : ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }


}

public class StackProblem {
    public static void main(String[] args) throws StackException {
        Stack stack = new Stack(4);
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.push(4);
        stack.push(7);
        stack.print();
        stack.peek();
    }
}
