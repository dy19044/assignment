package com.deepak.assignment;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;

    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        top = 0;
    }

    public void push(int x) {
        q1.add(x);
        top = x;
    }

    public int pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        int popValue = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return popValue;
    }

    public int peek() {
        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
    }
}
